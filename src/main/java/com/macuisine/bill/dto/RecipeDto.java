package com.macuisine.bill.dto;

import java.util.Set;

public class RecipeDto {
	private Integer recId;
	private String 	recName;
	private RecipeTypeDto recTypeDto;
	private Integer recPrepTime;
	private Integer recCookTime;
	private Integer recRestTime;
	private DietDto recDietDto;
	private Integer recNbPers;
	private Integer recTutoId;
	private Set<PreparationDto> recPreparationDtos;
	private Set<ToolDto> recToolDtos;
	private Set<MealDto> recMealDtos;
	private Set<TutorialDto> recTutorialDtos;

	
	public RecipeDto() {
	}

	public RecipeDto(Integer recId, String recName, RecipeTypeDto recTypeDto, Integer recPrepTime, Integer recCookTime,
			Integer recRestTime, DietDto recDietDto, Integer recNbPers, Integer recTutoId,
			Set<PreparationDto> recPreparationDtos, Set<ToolDto> recToolDtos,  Set<MealDto> recMealDtos, Set<TutorialDto> recTutorialDtos) {
		super();
		this.recId = recId;
		this.recName = recName;
		this.recTypeDto = recTypeDto;
		this.recPrepTime = recPrepTime;
		this.recCookTime = recCookTime;
		this.recRestTime = recRestTime;
		this.recDietDto = recDietDto;
		this.recNbPers = recNbPers;
		this.recTutoId = recTutoId;
		this.recPreparationDtos = recPreparationDtos;
		this.recToolDtos = recToolDtos;
		this.recMealDtos = recMealDtos;
		this.recTutorialDtos = recTutorialDtos;

	}

	public Integer getRecId() {
		return recId;
	}

	public void setRecId(Integer recId) {
		this.recId = recId;
	}

	public String getRecName() {
		return recName;
	}

	public void setRecName(String recName) {
		this.recName = recName;
	}

	public RecipeTypeDto getRecTypeDto() {
		return recTypeDto;
	}

	public void setRecTypeDto(RecipeTypeDto recTypeDto) {
		this.recTypeDto = recTypeDto;
	}

	public Integer getRecPrepTime() {
		return recPrepTime;
	}

	public void setRecPrepTime(Integer recPrepTime) {
		this.recPrepTime = recPrepTime;
	}

	public Integer getRecCookTime() {
		return recCookTime;
	}

	public void setRecCookTime(Integer recCookTime) {
		this.recCookTime = recCookTime;
	}

	public Integer getRecRestTime() {
		return recRestTime;
	}

	public void setRecRestTime(Integer recRestTime) {
		this.recRestTime = recRestTime;
	}

	public DietDto getRecDietDto() {
		return recDietDto;
	}

	public void setRecDietDto(DietDto recDietDto) {
		this.recDietDto = recDietDto;
	}

	public Integer getRecNbPers() {
		return recNbPers;
	}

	public void setRecNbPers(Integer recNbPers) {
		this.recNbPers = recNbPers;
	}

	public Integer getRecTutoId() {
		return recTutoId;
	}

	public void setRecTutoId(Integer recTutoId) {
		this.recTutoId = recTutoId;
	}

	public Set<PreparationDto> getRecPreparationDtos() {
		return recPreparationDtos;
	}

	public void setRecPreparationDtos(Set<PreparationDto> recPreparationDtos) {
		this.recPreparationDtos = recPreparationDtos;
	}

	public Set<ToolDto> getRecToolDtos() {
		return recToolDtos;
	}

	public void setRecToolDtos(Set<ToolDto> recToolDtos) {
		this.recToolDtos = recToolDtos;
	}

	public Set<MealDto> getRecMealDtos() {
		return recMealDtos;
	}

	public void setRecMealDtos(Set<MealDto> recMealDtos) {
		this.recMealDtos = recMealDtos;
	}

	public Set<TutorialDto> getRecTutorialDtos() {
		return recTutorialDtos;
	}

	public void setRecTutorialDtos(Set<TutorialDto> recTutorialDtos) {
		this.recTutorialDtos = recTutorialDtos;
	}
	
	
}
