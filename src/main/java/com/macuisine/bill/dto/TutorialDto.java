package com.macuisine.bill.dto;

import com.macuisine.bill.enums.TutoType;

public class TutorialDto {

	private Integer id;
	
	private RecipeDto recipeDto;
	
	private TutoType tutoType;
	
	private String url;
	
	private String source;

	public TutorialDto() {
		super();
	}

	public TutorialDto(Integer id, RecipeDto recipeDto, TutoType tutoType, String url, String source) {
		super();
		this.id = id;
		this.recipeDto = recipeDto;
		this.tutoType = tutoType;
		this.url = url;
		this.source = source;
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

	public TutoType getTutoType() {
		return tutoType;
	}

	public void setTutoType(TutoType tutoType) {
		this.tutoType = tutoType;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}
}
