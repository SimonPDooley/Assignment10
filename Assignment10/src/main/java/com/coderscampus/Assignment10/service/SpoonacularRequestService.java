package com.coderscampus.Assignment10.service;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.coderscampus.Assignment10.dto.DayResponse;
import com.coderscampus.Assignment10.dto.WeekResponse;

@Service
public class SpoonacularRequestService<T> {

	//Fill WeekResponse/DayResponse object 
	@SuppressWarnings("unchecked")
	public ResponseEntity<T> callSpoonacularApi(String numCalories, String diet, String exclusions, String timeFrame) {
		RestTemplate rt = new RestTemplate();
		URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
								   	  .queryParam("timeFrame", timeFrame)
								   	  .queryParam("targetCalories", numCalories)
								   	  .queryParam("diet", diet)
								   	  .queryParam("exclude", exclusions)
								   	  .queryParam("apiKey", "7ca212da62024603a96930f4bd9d31ed")
								   	  .build()
								   	  .toUri();
		if(timeFrame == "day") {
			ResponseEntity<DayResponse> response = rt.getForEntity(uri, DayResponse.class);
			return (ResponseEntity<T>) response;
		}
		else {
			ResponseEntity<WeekResponse> response = rt.getForEntity(uri, WeekResponse.class);
			return (ResponseEntity<T>) response;
		}	
	}
} 
