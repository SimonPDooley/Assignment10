package com.coderscampus.Assignment10.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.coderscampus.Assignment10.dto.DayResponse;
import com.coderscampus.Assignment10.dto.WeekResponse;
import com.coderscampus.Assignment10.service.SpoonacularRequestService;

public class MealPalnnerController {

	@Autowired
	private SpoonacularRequestService spoonacularRequestService;
	

	@GetMapping("mealplanner/week")
	public ResponseEntity<WeekResponse> getWeekMeals(String numCalories, String diet, String exclusions) {
										
		return spoonacularRequestService.callSpoonacularApiWeekPlan(numCalories, diet, exclusions);

	}

	@GetMapping("mealplanner/day")
	public ResponseEntity<DayResponse> getDayMeals(String numCalories, String diet, String exclusions) {
									
		return spoonacularRequestService.callSpoonacularApiDayPlan(numCalories, diet, exclusions);
	}

}
