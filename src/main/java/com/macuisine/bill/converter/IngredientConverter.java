package com.macuisine.bill.converter;

import com.macuisine.bill.dto.IngredientDto;
import com.macuisine.bill.entity.Ingredient;

public class IngredientConverter {
	
	public static Ingredient dtoToEntity(IngredientDto ingDto) {
		Ingredient ing = new Ingredient();
		
		ing.setId(ingDto.getIngId());
		ing.setName(ingDto.getIngName());
		ing.setIngredientType(IngredientTypeConverter.dtoToEntity(ingDto.getIngredientTypeDto()));
		ing.setKcal(ingDto.getIngKcal());
		
		return ing;
	}
	
	public static IngredientDto entityToDto(Ingredient ing) {
		IngredientDto ingDto = new IngredientDto();
		
		ingDto.setIngId(ing.getId());
		ingDto.setIngName(ing.getName());
		ingDto.setIngredientTypeDto(IngredientTypeConverter.entityToDto(ing.getIngredientType()));
		ingDto.setIngKcal(ing.getKcal());
		
		return ingDto;
	}
}
