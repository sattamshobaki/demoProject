package com.travel.model;

import javax.ws.rs.Produces;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
@XmlRootElement 
@Produces("application/json")
@JsonIgnoreProperties(ignoreUnknown = true)
public class JsonResponse {

	
	private Offer offers;
	private OfferInfo offerInfo;

	public Offer getOffers() {
		return offers;
	}

	public void setOffers(Offer offers) {
		this.offers = offers;
	}

	public OfferInfo getOfferInfo() {
		return offerInfo;
	}

	public void setOfferInfo(OfferInfo offerInfo) {
		this.offerInfo = offerInfo;
	}
	
	
}
