package com.macuisine.bill.dto;

import java.util.Set;

public class IngredientTypeDto {
	private Integer ingtypId;
	private String ingtypName;
	private Set<IngredientDto> ingredientDtos;
	
	public IngredientTypeDto() {
	}

	public IngredientTypeDto(Integer ingtypId, String ingtypName, Set<IngredientDto> ingredients) {
		this.ingtypId = ingtypId;
		this.ingtypName = ingtypName;
		this.ingredientDtos = ingredients;
	}
	
	public Integer getIngtypId() {
		return ingtypId;
	}
	
	public void setIngtypId(Integer ingtypId) {
		this.ingtypId = ingtypId;
	}
	
	public String getIngtypName() {
		return ingtypName;
	}
	
	public void setIngtypName(String ingtypName) {
		this.ingtypName = ingtypName;
	}
	
	public Set<IngredientDto> getIngredientDtos() {
		return ingredientDtos;
	}

	public void setIngredientDtos(Set<IngredientDto> ingredientDtos) {
		this.ingredientDtos = ingredientDtos;
	}
	
}
