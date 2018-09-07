package com.macuisine.bill.service;

import java.util.List;

import com.macuisine.bill.dto.RecipeDto;

public interface RecipeService {

	RecipeDto getRecipeById(Integer recipeId);
	void saveRecipe(RecipeDto recipeDto);
	List<RecipeDto> getAllRecipes();
}
