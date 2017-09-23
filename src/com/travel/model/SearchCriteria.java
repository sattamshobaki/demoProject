package com.travel.model;

import java.util.Date;

/**
 * Class wrap the search criteria for the user
 * 
 * @author Sattam
 *
 */
public class SearchCriteria {

	private String destinationName;
	private Date maxTripStartDate;
	private Date minTripStartDate;
	private Integer lengthOfStay;
	private float maxStarRating;
	private float minStarRating;

	public String getDestinationName() {
		return destinationName;
	}

	public void setDestinationName(String destinationName) {
		this.destinationName = destinationName;
	}

	public Date getMaxTripStartDate() {
		return maxTripStartDate;
	}

	public void setMaxTripStartDate(Date maxTripStartDate) {
		this.maxTripStartDate = maxTripStartDate;
	}

	public Date getMinTripStartDate() {
		return minTripStartDate;
	}

	public void setMinTripStartDate(Date minTripStartDate) {
		this.minTripStartDate = minTripStartDate;
	}

	public Integer getLengthOfStay() {
		return lengthOfStay;
	}

	public void setLengthOfStay(Integer lengthOfStay) {
		this.lengthOfStay = lengthOfStay;
	}

	public float getMaxStarRating() {
		return maxStarRating;
	}

	public void setMaxStarRating(float maxStarRating) {
		this.maxStarRating = maxStarRating;
	}

	public float getMinStarRating() {
		return minStarRating;
	}

	public void setMinStarRating(float minStarRating) {
		this.minStarRating = minStarRating;
	}

}
