package com.travel.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

public class Offer implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2368489390976969539L;
	
	private List<HotelDetails> hotels;

	
	public List<HotelDetails> getHotels() {
		return hotels;
	}
	@JsonProperty(value="Hotel")
	public void setHotels(List<HotelDetails> hotels) {
		this.hotels = hotels;
	}
}
