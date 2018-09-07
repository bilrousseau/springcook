package com.macuisine.bill.converter;

import java.util.HashSet;
import java.util.Set;

import com.macuisine.bill.dto.IngredientDto;
import com.macuisine.bill.dto.IngredientTypeDto;
import com.macuisine.bill.entity.Ingredient;
import com.macuisine.bill.entity.IngredientType;

public class IngredientTypeConverter {

	public static IngredientType dtoToEntity(IngredientTypeDto ingTypeDto) {
		IngredientType ingType = new IngredientType();
		
		Set<Ingredient> ingredients = new HashSet<Ingredient>();
		
		for (IngredientDto ingDto : ingTypeDto.getIngredientDtos()) {
			ingredients.add(IngredientConverter.dtoToEntity(ingDto));
		}
		
		ingType.setId(ingTypeDto.getIngtypId());
		ingType.setName(ingTypeDto.getIngtypName());
		ingType.setIngredients(ingredients);
		return ingType;
		
	}
	
	public static IngredientTypeDto entityToDto(IngredientType ingType) {
		IngredientTypeDto ingTypeDto = new IngredientTypeDto();
		
		Set<IngredientDto> ingredientDtos = new HashSet<IngredientDto>();
		for (Ingredient ing : ingType.getIngredients()) {
			ingredientDtos.add(IngredientConverter.entityToDto(ing));
		}
		
		ingTypeDto.setIngtypId(ingType.getId());
		ingTypeDto.setIngtypName(ingType.getName());
		ingTypeDto.setIngredientDtos(ingredientDtos);
		return ingTypeDto;
	}
}
