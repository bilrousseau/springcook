package com.macuisine.bill.dto;

import java.util.Set;

public class ToolTypeDto {

	private Integer tltypId;
	private String tltypName;
	private Set<ToolDto> toolDtos;
	
	public Integer getTltypId() {
		return tltypId;
	}
	public void setTltypId(Integer tltypId) {
		this.tltypId = tltypId;
	}
	public String getTltypName() {
		return tltypName;
	}
	public void setTltypName(String tltypName) {
		this.tltypName = tltypName;
	}
	public Set<ToolDto> getToolDtos() {
		return toolDtos;
	}
	public void setToolDtos(Set<ToolDto> toolDtos) {
		this.toolDtos = toolDtos;
	}
	
	
}
