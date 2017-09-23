package com.travel.model;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)

public class OfferDateRange {

	
	private List<Integer> travelStartDate = new ArrayList<Integer>(3);
	private List<Integer> travelEndDate = new ArrayList<Integer>(3);
	
	private Integer lengthOfStay;

	public List<Integer> getTravelStartDate() {
		return travelStartDate;
	}

	public void setTravelStartDate(List<Integer> travelStartDate) {
		this.travelStartDate = travelStartDate;
	}

	public List<Integer> getTravelEndDate() {
		return travelEndDate;
	}

	public void setTravelEndDate(List<Integer> travelEndDate) {
		this.travelEndDate = travelEndDate;
	}

	public Integer getLengthOfStay() {
		return lengthOfStay;
	}

	public void setLengthOfStay(Integer lengthOfStay) {
		this.lengthOfStay = lengthOfStay;
	}
	
	
}
