package com.macuisine.bill.dto;

import java.util.Set;

public class RecipeTypeDto {

	private Integer rectypId;
	private String rectypName;
	private Set<RecipeDto> recDtos;
	
	public RecipeTypeDto() {
		super();
	}
	
	public RecipeTypeDto(Integer rectypId, String rectypName, Set<RecipeDto> recDtos) {
		super();
		this.rectypId = rectypId;
		this.rectypName = rectypName;
		this.recDtos = recDtos;
	}
	public Integer getRectypId() {
		return rectypId;
	}
	public void setRectypId(Integer rectypId) {
		this.rectypId = rectypId;
	}
	public String getRectypName() {
		return rectypName;
	}
	public void setRectypName(String rectypName) {
		this.rectypName = rectypName;
	}
	public Set<RecipeDto> getRecDtos() {
		return recDtos;
	}
	public void setRecDtos(Set<RecipeDto> recDtos) {
		this.recDtos = recDtos;
	}
	
	
	
}
