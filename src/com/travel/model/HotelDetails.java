package com.travel.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * @author Sattam
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)

public class HotelDetails {

	private OfferDateRange offerDateRange;

	private DestinationInfo destination;
	private HotelInfo hotelInfo;
	private HotelPricingInfo hotelPricingInfo;

	private HotelUrls hotelUrls;

	private HotelScores hotelScores;

	public OfferDateRange getOfferDateRange() {
		return offerDateRange;
	}

	public void setOfferDateRange(OfferDateRange offerDateRange) {
		this.offerDateRange = offerDateRange;
	}

	public DestinationInfo getDestination() {
		return destination;
	}

	public void setDestination(DestinationInfo destination) {
		this.destination = destination;
	}

	public HotelInfo getHotelInfo() {
		return hotelInfo;
	}

	public void setHotelInfo(HotelInfo hotelInfo) {
		this.hotelInfo = hotelInfo;
	}

	public HotelPricingInfo getHotelPricingInfo() {
		return hotelPricingInfo;
	}

	public void setHotelPricingInfo(HotelPricingInfo hotelPricingInfo) {
		this.hotelPricingInfo = hotelPricingInfo;
	}

	public HotelUrls getHotelUrls() {
		return hotelUrls;
	}

	public void setHotelUrls(HotelUrls hotelUrls) {
		this.hotelUrls = hotelUrls;
	}

	public HotelScores getHotelScores() {
		return hotelScores;
	}

	public void setHotelScores(HotelScores hotelScores) {
		this.hotelScores = hotelScores;
	}

}
