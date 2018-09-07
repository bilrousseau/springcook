package com.macuisine.bill.converter;

import java.util.HashSet;
import java.util.Set;

import com.macuisine.bill.dto.RecipeDto;
import com.macuisine.bill.dto.RecipeTypeDto;
import com.macuisine.bill.entity.Recipe;
import com.macuisine.bill.entity.RecipeType;

public class RecipeTypeConverter {

	public static RecipeType dtoToEntity(RecipeTypeDto rectypDto) {
		RecipeType recType = new RecipeType();
		Set<Recipe> recipes = new HashSet<Recipe>();
		
		for (RecipeDto recDto : rectypDto.getRecDtos()) {
			recipes.add(RecipeConverter.dtoToEntity(recDto));
		}
		
		recType.setId(rectypDto.getRectypId());
		recType.setName(rectypDto.getRectypName());
		recType.setRecipes(recipes);
		
		return recType;
		
	}
	
	public static RecipeTypeDto entityToDto(RecipeType recType) {
		RecipeTypeDto recTypDto = new RecipeTypeDto();
		Set<RecipeDto> recipeDtos = new HashSet<RecipeDto>();
		
		for (Recipe rec : recType.getRecipes()) {
			recipeDtos.add(RecipeConverter.entityToDto(rec));
		}
		
		recTypDto.setRectypId(recType.getId());
		recTypDto.setRectypName(recType.getName());
		recTypDto.setRecDtos(recipeDtos);
		
		return recTypDto;
		
		
	}
}
