package com.travel.control;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.travel.service.RestServiceClient;
import com.travel.model.HotelDetails;
import com.travel.model.SearchCriteria;

/**
 * Controller servlet to receive the request and process it and go back to view
 * page
 * 
 * @author Sattam
 *
 */
public class SearchDealsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SearchDealsServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		SearchCriteria criteria = prepareSearchCriteria(request);
		List<HotelDetails> hotels = new RestServiceClient().findHotels(criteria);
		request.setAttribute("hotels", hotels);

		request.getRequestDispatcher("find-hotels.jsp").forward(request, response);

	}

	private SearchCriteria prepareSearchCriteria(HttpServletRequest request) {
		SearchCriteria criteria = new SearchCriteria();
		String destinationName = request.getParameter("destinationName");
		String maxTripStartDate = request.getParameter("maxTripStartDate");
		String minTripStartDate = request.getParameter("minTripStartDate");
		String lengthOfStay = request.getParameter("lengthOfStay");
		String minStarRating = request.getParameter("minStarRating");
		String maxStarRating = request.getParameter("minStarRating");
		if (!isEmpty(lengthOfStay)) {
			criteria.setLengthOfStay(Integer.parseInt(lengthOfStay));
		}
		criteria.setDestinationName(destinationName);
		try {
			if (!isEmpty(maxTripStartDate)) {
				criteria.setMaxTripStartDate(new SimpleDateFormat("yyyy-MM-dd").parse(maxTripStartDate));
			}
			if (!isEmpty(minTripStartDate)) {
				criteria.setMinTripStartDate(new SimpleDateFormat("yyyy-MM-dd").parse(minTripStartDate));
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}

		if (!isEmpty(minStarRating)) {
			criteria.setMinStarRating(Float.parseFloat(minStarRating));
		}

		if (!isEmpty(maxStarRating)) {
			criteria.setMaxStarRating(Float.parseFloat(maxStarRating));
		}
		return criteria;
	}

	private boolean isEmpty(String val) {
		return val != null && val.trim().length() == 0;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
