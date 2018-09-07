package com.macuisine.bill.converter;

import com.macuisine.bill.dto.ToolDto;
import com.macuisine.bill.entity.Tool;

public class ToolConverter {

	public static Tool dtoToEntity(ToolDto toolDto) {
		Tool tool = new Tool();
		
		tool.setId(toolDto.getToolId());
		tool.setName(toolDto.getToolName());
		tool.setType(ToolTypeConverter.dtoToEntity(toolDto.getToolTypeDto()));
		
		return tool;
	}
	
	public static ToolDto entityToDto(Tool tool) {
		ToolDto toolDto = new ToolDto();
		
		toolDto.setToolId(tool.getId());
		toolDto.setToolName(tool.getName());
		toolDto.setToolTypeDto(ToolTypeConverter.entityToDto(tool.getType()));
		
		return toolDto;
		
	}
	
}
