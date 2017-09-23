package com.travel.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class HotelPricingInfo {
	
	
	private float averagePriceValue;
	private float totalPriceValue;
	private float originalPricePerNight;
	private float hotelTotalBaseRate;
	private float hotelTotalTaxesAndFees;
	private String currency;
	private float hotelTotalMandatoryTaxesAndFees;
	private float percentSavings;
	private boolean drr;
	public float getAveragePriceValue() {
		return averagePriceValue;
	}
	public void setAveragePriceValue(float averagePriceValue) {
		this.averagePriceValue = averagePriceValue;
	}
	public float getTotalPriceValue() {
		return totalPriceValue;
	}
	public void setTotalPriceValue(float totalPriceValue) {
		this.totalPriceValue = totalPriceValue;
	}
	public float getOriginalPricePerNight() {
		return originalPricePerNight;
	}
	public void setOriginalPricePerNight(float originalPricePerNight) {
		this.originalPricePerNight = originalPricePerNight;
	}
	public float getHotelTotalBaseRate() {
		return hotelTotalBaseRate;
	}
	public void setHotelTotalBaseRate(float hotelTotalBaseRate) {
		this.hotelTotalBaseRate = hotelTotalBaseRate;
	}
	public float getHotelTotalTaxesAndFees() {
		return hotelTotalTaxesAndFees;
	}
	public void setHotelTotalTaxesAndFees(float hotelTotalTaxesAndFees) {
		this.hotelTotalTaxesAndFees = hotelTotalTaxesAndFees;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public float getHotelTotalMandatoryTaxesAndFees() {
		return hotelTotalMandatoryTaxesAndFees;
	}
	public void setHotelTotalMandatoryTaxesAndFees(float hotelTotalMandatoryTaxesAndFees) {
		this.hotelTotalMandatoryTaxesAndFees = hotelTotalMandatoryTaxesAndFees;
	}
	public float getPercentSavings() {
		return percentSavings;
	}
	public void setPercentSavings(float percentSavings) {
		this.percentSavings = percentSavings;
	}
	public boolean isDrr() {
		return drr;
	}
	public void setDrr(boolean drr) {
		this.drr = drr;
	}
	
	
}
