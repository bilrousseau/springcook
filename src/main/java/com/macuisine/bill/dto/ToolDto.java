package com.macuisine.bill.dto;

import java.util.Set;

public class ToolDto {

	private Integer toolId;
	private String 	toolName;
	private ToolTypeDto toolTypeDto;
	private Set<RecipeDto> recipeDtos;
	
	public ToolDto() {
		super();
	}

	public ToolDto(Integer toolId, String toolName, ToolTypeDto toolTypeDto, Set<RecipeDto> recipeDtos) {
		super();
		this.toolId = toolId;
		this.toolName = toolName;
		this.toolTypeDto = toolTypeDto;
		this.recipeDtos = recipeDtos;
	}

	public Integer getToolId() {
		return toolId;
	}

	public void setToolId(Integer toolId) {
		this.toolId = toolId;
	}

	public String getToolName() {
		return toolName;
	}

	public void setToolName(String toolName) {
		this.toolName = toolName;
	}

	public ToolTypeDto getToolTypeDto() {
		return toolTypeDto;
	}

	public void setToolTypeDto(ToolTypeDto toolTypeDto) {
		this.toolTypeDto = toolTypeDto;
	}

	public Set<RecipeDto> getRecipeDtos() {
		return recipeDtos;
	}

	public void setRecipeDtos(Set<RecipeDto> recipeDtos) {
		this.recipeDtos = recipeDtos;
	}
}
