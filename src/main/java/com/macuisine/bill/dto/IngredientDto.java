package com.macuisine.bill.dto;

public class IngredientDto {
	
	private Integer ingId;
	private String 	ingName;
	private IngredientTypeDto ingredientTypeDto;
	private Integer ingKcal;
	
	public IngredientDto() {
		
	}
	
	public IngredientDto(Integer ingId, String ingName, IngredientTypeDto ingredientTypeDto, Integer ingKcal) {
		this.ingId = ingId;
		this.ingName = ingName;
		this.setIngredientTypeDto(ingredientTypeDto);
		this.ingKcal = ingKcal;
	}

	public Integer getIngId() {
		return ingId;
	}

	public void setIngId(Integer ingId) {
		this.ingId = ingId;
	}

	public String getIngName() {
		return ingName;
	}

	public void setIngName(String ingName) {
		this.ingName = ingName;
	}

	public IngredientTypeDto getIngredientTypeDto() {
		return ingredientTypeDto;
	}

	public void setIngredientTypeDto(IngredientTypeDto ingredientTypeDto) {
		this.ingredientTypeDto = ingredientTypeDto;
	}

	public Integer getIngKcal() {
		return ingKcal;
	}

	public void setIngKcal(Integer ingKcal) {
		this.ingKcal = ingKcal;
	}
	
	
	
}
