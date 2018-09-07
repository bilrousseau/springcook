package com.macuisine.bill.converter;

import java.util.HashSet;
import java.util.Set;

import com.macuisine.bill.dto.DietDto;
import com.macuisine.bill.dto.RecipeDto;
import com.macuisine.bill.entity.Diet;
import com.macuisine.bill.entity.Recipe;

public class DietConverter {

	public static Diet dtoToEntity(DietDto dietDto) {
		Diet diet = new Diet();
		Set<Recipe> recipes = new HashSet<Recipe>();
		
		for (RecipeDto recDto : dietDto.getRecDtos()) {
			recipes.add(RecipeConverter.dtoToEntity(recDto));
		}
		
		diet.setId(dietDto.getId());
		diet.setName(dietDto.getName());
		diet.setRecipes(recipes);
		
		return diet;
	}
	
	public static DietDto entityToDto(Diet diet) {
		DietDto dietDto = new DietDto();
		Set<RecipeDto> recipeDtos = new HashSet<RecipeDto>();
		
		for (Recipe rec : diet.getRecipes()) {
			recipeDtos.add(RecipeConverter.entityToDto(rec));
		}
		
		dietDto.setId(diet.getId());
		dietDto.setName(diet.getName());
		dietDto.setRecDtos(recipeDtos);
		
		return dietDto;
		
	}
}
