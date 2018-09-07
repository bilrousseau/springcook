package com.macuisine.bill.dto;

public class PreparationDto {
	
	private Integer id;
	private RecipeDto recipeDto;
	private IngredientDto ingredientDto;
	private Double quantity;
	private String measure;
	
	public PreparationDto() {
		super();
	}

	public PreparationDto(Integer id, RecipeDto recipeDto, IngredientDto ingredientDto, Double quantity,
			String measure) {
		this.id = id;
		this.recipeDto = recipeDto;
		this.ingredientDto = ingredientDto;
		this.quantity = quantity;
		this.measure = measure;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public RecipeDto getRecipeDto() {
		return recipeDto;
	}

	public void setRecipeDto(RecipeDto recipeDto) {
		this.recipeDto = recipeDto;
	}

	public IngredientDto getIngredientDto() {
		return ingredientDto;
	}

	public void setIngredientDto(IngredientDto ingredientDto) {
		this.ingredientDto = ingredientDto;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public String getMeasure() {
		return measure;
	}

	public void setMeasure(String measure) {
		this.measure = measure;
	}
}
