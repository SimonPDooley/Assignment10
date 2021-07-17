package com.coderscampus.Assignment10.service;

import java.net.URI;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.coderscampus.Assignment10.dto.DayResponse;
import com.coderscampus.Assignment10.dto.WeekResponse;


public class SpoonacularRequestService {
	
	@Test
	public void callSpoonacularApi() {
		RestTemplate rt = new RestTemplate();
		
		URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
									  .queryParam("timeFrame", "day")
									  .queryParam("targetCalories", "2000")
									  .queryParam("diet", "vegetarian")
									  .queryParam("exclude", "shellfish")
									  .queryParam("apiKey", "7ca212da62024603a96930f4bd9d31ed")
									  .build()
									  .toUri();	
		ResponseEntity<DayResponse> response = rt.getForEntity(uri, DayResponse.class);
		System.out.println(response.getBody());
	
	}
	

	

	
	public ResponseEntity<WeekResponse> callSpoonacularApiWeekPlan(String numCalories, String diet, String exclusions) {
		RestTemplate rt = new RestTemplate();

		URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
								   	  .queryParam("timeFrame", "week")
								   	  .queryParam("targetCalories", numCalories)
								   	  .queryParam("diet", diet)
								   	  .queryParam("exclude", exclusions)
								   	  .queryParam("apiKey", "7ca212da62024603a96930f4bd9d31ed")
								   	  .build()
								   	  .toUri();
		ResponseEntity<WeekResponse> response = rt.getForEntity(uri, WeekResponse.class);
		
		return response;
  }
	
	public ResponseEntity<DayResponse> callSpoonacularApiDayPlan(String numCalories, String diet, String exclusions) {
		RestTemplate rt = new RestTemplate();

		URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
								   	  .queryParam("timeFrame", "day")
								   	  .queryParam("targetCalories", numCalories)
								   	  .queryParam("diet", diet)
								   	  .queryParam("exclude", exclusions)
								   	  .queryParam("apiKey", "7ca212da62024603a96930f4bd9d31ed")
								   	  .build()
								   	  .toUri();
		ResponseEntity<DayResponse> response = rt.getForEntity(uri, DayResponse.class);
		
		return response;
  }
} 
