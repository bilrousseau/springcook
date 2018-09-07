package com.macuisine.bill.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.macuisine.bill.converter.RecipeConverter;
import com.macuisine.bill.dto.RecipeDto;
import com.macuisine.bill.repository.RecipeRepository;

@Service
public class RecipeServiceImpl implements RecipeService {

	@Autowired
	private RecipeRepository recipeRepository;
	
	@Override
	public RecipeDto getRecipeById(Integer recipeId) {
		return RecipeConverter.entityToDto(this.recipeRepository.getOne(recipeId));
	}

	@Override
	public void saveRecipe(RecipeDto recipeDto) {
		this.recipeRepository.save(RecipeConverter.dtoToEntity(recipeDto));
	}

	@Override
	public List<RecipeDto> getAllRecipes() {
		return this.recipeRepository.findAll()
				.stream().map(RecipeConverter::entityToDto).collect(Collectors.toList());
	}

}
