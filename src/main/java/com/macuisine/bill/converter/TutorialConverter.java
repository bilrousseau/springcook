package com.macuisine.bill.converter;

import com.macuisine.bill.dto.TutorialDto;
import com.macuisine.bill.entity.Tutorial;

public class TutorialConverter {

	public static Tutorial dtoToEntity(TutorialDto tutDto) {
		Tutorial tut = new Tutorial();
		
		tut.setId(tutDto.getId());
		tut.setRecipe(RecipeConverter.dtoToEntity(tutDto.getRecipeDto()));
		tut.setTutoType(tutDto.getTutoType());
		tut.setSource(tutDto.getSource());
		tut.setUrl(tutDto.getUrl());
		
		return tut;
	}
	
	public static TutorialDto entityToDto(Tutorial tut) {
		TutorialDto tutDto = new TutorialDto();
		
		tutDto.setId(tut.getId());
		tutDto.setRecipeDto(RecipeConverter.entityToDto(tut.getRecipe()));
		tutDto.setTutoType(tut.getTutoType());
		tutDto.setSource(tut.getSource());
		tutDto.setUrl(tut.getUrl());
		
		return tutDto;
		
		
	}
}
