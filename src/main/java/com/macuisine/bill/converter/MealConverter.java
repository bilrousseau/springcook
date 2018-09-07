package com.macuisine.bill.converter;

import com.macuisine.bill.dto.MealDto;
import com.macuisine.bill.entity.Meal;

public class MealConverter {

	public static Meal dtoToEntity(MealDto mealDto) {
		Meal meal = new Meal();
		
		meal.setId(mealDto.getId());
		meal.setRecipe(RecipeConverter.dtoToEntity(mealDto.getRecipeDto()));
		meal.setGrade(mealDto.getGrade());
		meal.setDate(mealDto.getDate());
		
		return meal;
		
	}
	
	public static MealDto entityToDto(Meal meal) {
		MealDto mealDto = new MealDto();
		
		mealDto.setId(meal.getId());
		mealDto.setRecipeDto(RecipeConverter.entityToDto(meal.getRecipe()));
		mealDto.setGrade(meal.getGrade());
		mealDto.setDate(meal.getDate());
		
		return mealDto;
		
	}
}
