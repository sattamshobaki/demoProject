package com.travel.service;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import org.codehaus.jackson.map.ObjectMapper;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.travel.SystemConfig;
import com.travel.model.HotelDetails;
import com.travel.model.JsonResponse;
import com.travel.model.SearchCriteria;

/**
 * Service client for restful webservice
 * 
 * @author Sattam
 *
 */
public class RestServiceClient {

	public List<HotelDetails> findHotels(SearchCriteria criteria) {

		ClientConfig clientConfig = new DefaultClientConfig();

		Client client = Client.create(clientConfig);
		SystemConfig config = SystemConfig.getInstance();
		try {
			String params = prepareSearchParameters(criteria, config);

			URI uri = new URI(config.getProtocol(), config.getSite(), config.getServicePath(), params, null);

			WebResource service = client.resource(UriBuilder.fromUri(uri).build());

			String result = service.accept(MediaType.APPLICATION_JSON).get(String.class);
			if (result == null || result.trim().length() == 0) {
				return null;
			}
			ObjectMapper mapper = new ObjectMapper();
			JsonResponse jsonResponse = mapper.readValue(result, JsonResponse.class);
			if (jsonResponse != null && jsonResponse.getOffers() != null) {
				return jsonResponse.getOffers().getHotels();
			}
		} catch (URISyntaxException | IOException e) {
			throw new RuntimeException(e);// change it to service excpetion
		}
		return null;
	}

	private String prepareSearchParameters(SearchCriteria criteria, SystemConfig config) {
		StringBuilder searchPath = new StringBuilder();
		searchPath.append(config.getDefaultParams());
		if (criteria.getMinStarRating() > 0) {
			searchPath.append("&minStarRating=");
			searchPath.append(criteria.getMinStarRating());
		} else {
			searchPath.append("&minStarRating=1");
		}
		if (criteria.getMaxStarRating() > 0) {
			searchPath.append("&maxStarRating=");
			searchPath.append(criteria.getMaxStarRating());
		} else {
			searchPath.append("&maxStarRating=5");
		}
		if (criteria.getLengthOfStay() != null) {
			searchPath.append("&lengthOfStay=");
			searchPath.append(criteria.getLengthOfStay());
		} else {
			searchPath.append("&lengthOfStay=7");
		}
		if (criteria.getDestinationName() != null && criteria.getDestinationName().trim().length() > 0) {
			searchPath.append("&destinationName=");
			searchPath.append(criteria.getDestinationName());
		} else {
			searchPath.append("&destinationName=Montreal");
		}
		if (criteria.getMaxTripStartDate() != null) {
			searchPath.append("&minTripStartDate=:");
			searchPath.append(new SimpleDateFormat("yyyy-MM-dd").format(criteria.getMaxTripStartDate()));
		} else {
			searchPath.append("&minTripStartDate=:2017-06-01");
		}
		if (criteria.getMinTripStartDate() != null) {
			searchPath.append("&minTripStartDate=:");
			searchPath.append(new SimpleDateFormat("yyyy-MM-dd").format(criteria.getMinTripStartDate()));
		} else {
			searchPath.append("&minTripStartDate=:2017-06-01");
		}
		return searchPath.toString();
	}
}
