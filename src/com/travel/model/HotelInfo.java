package com.travel.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class HotelInfo {

	
	private Long hotelId;
    private String hotelName;
    private String hotelDestination;
    private String hotelDestinationRegionID;
    private String hotelLongDestination;
    private String hotelStreetAddress;
    private String hotelCity;
    private String hotelProvince;
    private String hotelCountryCode;
    private String hotelLocation;
    private String hotelLatitude;
    private String hotelLongitude;
    private float hotelStarRating;
    private float hotelGuestReviewRating;
    private String travelStartDate;
    private String travelEndDate;
    private String hotelImageUrl;
    private float carPackageScore;
    private String description;
    private float distanceFromUser;
    private String language;
    private float movingAverageScore;
    private float promotionAmount;
    private String promotionDescription;
    private String promotionTag;
    private float rawAppealScore;
    private float relevanceScore;
    private Integer statusCode;
    private String statusDescription;
    private boolean carPackage;
    private boolean allInclusive;
	public Long getHotelId() {
		return hotelId;
	}
	public void setHotelId(Long hotelId) {
		this.hotelId = hotelId;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getHotelDestination() {
		return hotelDestination;
	}
	public void setHotelDestination(String hotelDestination) {
		this.hotelDestination = hotelDestination;
	}
	public String getHotelDestinationRegionID() {
		return hotelDestinationRegionID;
	}
	public void setHotelDestinationRegionID(String hotelDestinationRegionID) {
		this.hotelDestinationRegionID = hotelDestinationRegionID;
	}
	public String getHotelLongDestination() {
		return hotelLongDestination;
	}
	public void setHotelLongDestination(String hotelLongDestination) {
		this.hotelLongDestination = hotelLongDestination;
	}
	public String getHotelStreetAddress() {
		return hotelStreetAddress;
	}
	public void setHotelStreetAddress(String hotelStreetAddress) {
		this.hotelStreetAddress = hotelStreetAddress;
	}
	public String getHotelCity() {
		return hotelCity;
	}
	public void setHotelCity(String hotelCity) {
		this.hotelCity = hotelCity;
	}
	public String getHotelProvince() {
		return hotelProvince;
	}
	public void setHotelProvince(String hotelProvince) {
		this.hotelProvince = hotelProvince;
	}
	public String getHotelCountryCode() {
		return hotelCountryCode;
	}
	public void setHotelCountryCode(String hotelCountryCode) {
		this.hotelCountryCode = hotelCountryCode;
	}
	public String getHotelLocation() {
		return hotelLocation;
	}
	public void setHotelLocation(String hotelLocation) {
		this.hotelLocation = hotelLocation;
	}
	public String getHotelLatitude() {
		return hotelLatitude;
	}
	public void setHotelLatitude(String hotelLatitude) {
		this.hotelLatitude = hotelLatitude;
	}
	public String getHotelLongitude() {
		return hotelLongitude;
	}
	public void setHotelLongitude(String hotelLongitude) {
		this.hotelLongitude = hotelLongitude;
	}
	public float getHotelStarRating() {
		return hotelStarRating;
	}
	public void setHotelStarRating(float hotelStarRating) {
		this.hotelStarRating = hotelStarRating;
	}
	public float getHotelGuestReviewRating() {
		return hotelGuestReviewRating;
	}
	public void setHotelGuestReviewRating(float hotelGuestReviewRating) {
		this.hotelGuestReviewRating = hotelGuestReviewRating;
	}
	public String getTravelStartDate() {
		return travelStartDate;
	}
	public void setTravelStartDate(String travelStartDate) {
		this.travelStartDate = travelStartDate;
	}
	public String getTravelEndDate() {
		return travelEndDate;
	}
	public void setTravelEndDate(String travelEndDate) {
		this.travelEndDate = travelEndDate;
	}
	public String getHotelImageUrl() {
		return hotelImageUrl;
	}
	public void setHotelImageUrl(String hotelImageUrl) {
		this.hotelImageUrl = hotelImageUrl;
	}
	public float getCarPackageScore() {
		return carPackageScore;
	}
	public void setCarPackageScore(float carPackageScore) {
		this.carPackageScore = carPackageScore;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getDistanceFromUser() {
		return distanceFromUser;
	}
	public void setDistanceFromUser(float distanceFromUser) {
		this.distanceFromUser = distanceFromUser;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public float getMovingAverageScore() {
		return movingAverageScore;
	}
	public void setMovingAverageScore(float movingAverageScore) {
		this.movingAverageScore = movingAverageScore;
	}
	public float getPromotionAmount() {
		return promotionAmount;
	}
	public void setPromotionAmount(float promotionAmount) {
		this.promotionAmount = promotionAmount;
	}
	public String getPromotionDescription() {
		return promotionDescription;
	}
	public void setPromotionDescription(String promotionDescription) {
		this.promotionDescription = promotionDescription;
	}
	public String getPromotionTag() {
		return promotionTag;
	}
	public void setPromotionTag(String promotionTag) {
		this.promotionTag = promotionTag;
	}
	public float getRawAppealScore() {
		return rawAppealScore;
	}
	public void setRawAppealScore(float rawAppealScore) {
		this.rawAppealScore = rawAppealScore;
	}
	public float getRelevanceScore() {
		return relevanceScore;
	}
	public void setRelevanceScore(float relevanceScore) {
		this.relevanceScore = relevanceScore;
	}
	public Integer getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}
	public String getStatusDescription() {
		return statusDescription;
	}
	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}
	public boolean isCarPackage() {
		return carPackage;
	}
	public void setCarPackage(boolean carPackage) {
		this.carPackage = carPackage;
	}
	public boolean isAllInclusive() {
		return allInclusive;
	}
	public void setAllInclusive(boolean allInclusive) {
		this.allInclusive = allInclusive;
	}
    
    
}
