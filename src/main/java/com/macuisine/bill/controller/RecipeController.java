package com.macuisine.bill.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.macuisine.bill.dto.RecipeDto;
import com.macuisine.bill.entity.Recipe;
import com.macuisine.bill.enums.Constants;
import com.macuisine.bill.service.RecipeService;

@Controller
public class RecipeController {
	
	@Autowired
	private RecipeService recipeService;
	
	@RequestMapping("/recipes/recipe/")
	public RecipeDto getRecipeById(@PathVariable Integer recipeId) {
		return recipeService.getRecipeById(recipeId);
	}
	
	@RequestMapping("/recipes/all")
	public List<RecipeDto> getAllRecipes() {
		return recipeService.getAllRecipes();
	}
	
	@RequestMapping(value = "/recipes/save", method = RequestMethod.POST)
	public void saveRecipe(@RequestBody RecipeDto recDto)
	{
		this.recipeService.saveRecipe(recDto);
	}	
}

	
