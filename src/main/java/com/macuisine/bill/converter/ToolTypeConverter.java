package com.macuisine.bill.converter;

import java.util.HashSet;
import java.util.Set;

import com.macuisine.bill.dto.ToolDto;
import com.macuisine.bill.dto.ToolTypeDto;
import com.macuisine.bill.entity.Tool;
import com.macuisine.bill.entity.ToolType;

public class ToolTypeConverter {

	public static ToolType dtoToEntity(ToolTypeDto toolTypeDto) {
		ToolType tltyp = new ToolType();
		Set<Tool> tools = new HashSet<Tool>();
		
		for (ToolDto toolDto : toolTypeDto.getToolDtos()) {
			tools.add(ToolConverter.dtoToEntity(toolDto));
		}
		
		tltyp.setId(toolTypeDto.getTltypId());
		tltyp.setName(toolTypeDto.getTltypName());
		tltyp.setTools(tools);
		
		return tltyp;
		
	}
	
	public static ToolTypeDto entityToDto(ToolType toolType) {
		ToolTypeDto tltypDto = new ToolTypeDto();
		
		Set<ToolDto> toolDtos = new HashSet<ToolDto>();
		
		for (Tool tl : toolType.getTools()) {
			toolDtos.add(ToolConverter.entityToDto(tl));
		}
		
		tltypDto.setTltypId(toolType.getId());
		tltypDto.setTltypName(toolType.getName());
		tltypDto.setToolDtos(toolDtos);
		
		return tltypDto;
		
		
	}
}
