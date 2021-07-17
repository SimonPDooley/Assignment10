package com.coderscampus.Assignment10.dto;


import com.fasterxml.jackson.annotation.JsonProperty;

public class WeekResponse {
	
	@JsonProperty("week")
	private MealsForDayOfWeek weekResponse;
}
