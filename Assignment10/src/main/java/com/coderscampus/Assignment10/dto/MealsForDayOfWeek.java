package com.coderscampus.Assignment10.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MealsForDayOfWeek {
	
	@JsonProperty("monday")
	private MealsForWeek monday;
	
	@JsonProperty("tuesday")
	private MealsForWeek tuesday;
	
	@JsonProperty("wednesday")
	private MealsForWeek wednesday;
	
	@JsonProperty("thursday")
	private MealsForWeek thursday;
	
	@JsonProperty("friday")
	private MealsForWeek friday;

	@JsonProperty("saturday")
	private MealsForWeek saturday;
	
	@JsonProperty("sunday")
	private MealsForWeek sunday;
}
