package com.macuisine.bill.converter;

import com.macuisine.bill.dto.PreparationDto;
import com.macuisine.bill.entity.Preparation;

public class PreparationConverter {

	public static Preparation dtoToEntity(PreparationDto recIngDto) {
		Preparation recIng = new Preparation();
		
		recIng.setId(recIng.getId());
		recIng.setQuantity(recIngDto.getQuantity());
		recIng.setMeasure(recIngDto.getMeasure());
		
		return recIng;
		
	}
	
	public static PreparationDto entityToDto(Preparation recIng) {
		PreparationDto recIngDto = new PreparationDto();
		
		recIng.setId(recIng.getId());
		recIngDto.setQuantity(recIng.getQuantity());
		recIngDto.setMeasure(recIng.getMeasure());
		
		return recIngDto;
		
	}
}
