package com.macuisine.bill.enums;

public enum Constants {
	GET_RECIPE_BY_ID("/recipes/recipe/"),
	GET_ALL_RECIPES("/recipes/all"),
	SAVE_RECIPE("/recipes/save");
	
	private String url = "";
	
	Constants(String url) {
		this.url = url;
	}
	
	public String toString() {
		return this.url;
	}
}
