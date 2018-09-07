package com.macuisine.bill.dto;

import java.util.Date;

public class MealDto {

	private Integer id;
	private RecipeDto recipeDto;
	private Date date;
	private Integer grade;
	
	public MealDto() {
		super();
	}

	public MealDto(Integer id, RecipeDto recipeDto, Date date, Integer grade) {
		super();
		this.id = id;
		this.recipeDto = recipeDto;
		this.date = date;
		this.grade = grade;
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


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public Integer getGrade() {
		return grade;
	}


	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	
}
