package com.coderscampus.Assignment10.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DayResponse {
	@JsonProperty("meals")
	private Meal[] meal;
	
	@JsonProperty("nutrients")
	private Nutrients nutrients;
}
