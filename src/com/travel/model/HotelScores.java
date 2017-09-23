package com.travel.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class HotelScores {

	
	private float rawAppealScore;
	private float movingAverageScore;
	public float getRawAppealScore() {
		return rawAppealScore;
	}
	public void setRawAppealScore(float rawAppealScore) {
		this.rawAppealScore = rawAppealScore;
	}
	public float getMovingAverageScore() {
		return movingAverageScore;
	}
	public void setMovingAverageScore(float movingAverageScore) {
		this.movingAverageScore = movingAverageScore;
	}
	
	
}
