package com.macuisine.bill.dto;

import java.util.Set;

public class DietDto {
	
	private Integer id;
	private String name;
	private Set<RecipeDto> recDtos;
	
	public DietDto() {
		super();
	}

	public DietDto(Integer id, String name, Set<RecipeDto> recDtos) {
		super();
		this.id = id;
		this.name = name;
		this.recDtos = recDtos;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<RecipeDto> getRecDtos() {
		return recDtos;
	}
	public void setRecDtos(Set<RecipeDto> recDtos) {
		this.recDtos = recDtos;
	}
	
	
}
