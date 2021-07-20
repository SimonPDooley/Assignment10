package com.coderscampus.Assignment10.web;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.Assignment10.dto.DayResponse;
import com.coderscampus.Assignment10.dto.WeekResponse;
import com.coderscampus.Assignment10.service.SpoonacularRequestService;

@SuppressWarnings("unchecked")
@RestController
public class MealPalnnerController<T> {

	@Autowired
	private SpoonacularRequestService<T> spoonacularRequestService;	

	@GetMapping("/mealplanner/week")
	public ResponseEntity<WeekResponse> getWeekMeals(@RequestParam String numCalories,@RequestParam String diet,@RequestParam String exclusions) {							
		return (ResponseEntity<WeekResponse>) spoonacularRequestService.callSpoonacularApi(numCalories, diet, exclusions, "week");
	}

	@GetMapping("/mealplanner/day")
	public ResponseEntity<DayResponse> getDayMeals(@RequestParam String numCalories,@RequestParam String diet,@RequestParam String exclusions) {								
		return (ResponseEntity<DayResponse>) spoonacularRequestService.callSpoonacularApi(numCalories, diet, exclusions, "day");
	}
}
