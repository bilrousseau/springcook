package com.macuisine.bill.converter;

import java.util.HashSet;
import java.util.Set;

import com.macuisine.bill.dto.MealDto;
import com.macuisine.bill.dto.PreparationDto;
import com.macuisine.bill.dto.RecipeDto;
import com.macuisine.bill.dto.ToolDto;
import com.macuisine.bill.dto.TutorialDto;
import com.macuisine.bill.entity.Meal;
import com.macuisine.bill.entity.Preparation;
import com.macuisine.bill.entity.Recipe;
import com.macuisine.bill.entity.Tool;
import com.macuisine.bill.entity.Tutorial;

public class RecipeConverter {

	public static Recipe dtoToEntity(RecipeDto recDto) {
		Recipe rec = new Recipe();
		
		Set<Preparation> preparations = new HashSet<Preparation>();
		Set<Tool> tools = new HashSet<Tool>();
		Set<Meal> meals = new HashSet<Meal>();
		Set<Tutorial> tutorials = new HashSet<Tutorial>();

		
		for (PreparationDto prepDto : recDto.getRecPreparationDtos()) {
			preparations.add(PreparationConverter.dtoToEntity(prepDto));
		}
		
		for (ToolDto toolDto : recDto.getRecToolDtos()) {
			tools.add(ToolConverter.dtoToEntity(toolDto));
		}
		
		for (MealDto mealDto : recDto.getRecMealDtos()) {
			meals.add(MealConverter.dtoToEntity(mealDto));
		}
		
		for (TutorialDto tutDto : recDto.getRecTutorialDtos()) {
			tutorials.add(TutorialConverter.dtoToEntity(tutDto));
		}

		rec.setId(recDto.getRecId());
		rec.setName(recDto.getRecName());
		rec.setType(RecipeTypeConverter.dtoToEntity(recDto.getRecTypeDto()));
		rec.setPrepTime(recDto.getRecPrepTime());
		rec.setCookTime(recDto.getRecCookTime());
		rec.setRestTime(recDto.getRecRestTime());
		rec.setDiet(DietConverter.dtoToEntity(recDto.getRecDietDto()));
		rec.setNbPers(recDto.getRecNbPers());
		rec.setTutoId(recDto.getRecTutoId());
		rec.setPreparations(preparations);
		rec.setTools(tools);
		rec.setMeals(meals);
		rec.setTutorials(tutorials);

		
		return rec;
	}
	
	public static RecipeDto entityToDto(Recipe rec) {
		RecipeDto recDto = new RecipeDto();
		
		Set<PreparationDto> preparationDtos = new HashSet<PreparationDto>();
		Set<ToolDto> toolDtos = new HashSet<ToolDto>();
		Set<MealDto> mealDtos = new HashSet<MealDto>();
		Set<TutorialDto> tutDtos = new HashSet<TutorialDto>();


		for (Preparation prep : rec.getPreparations()) {
			preparationDtos.add(PreparationConverter.entityToDto(prep));
		}
		
		for (Tool tl : rec.getTools()) {
			toolDtos.add(ToolConverter.entityToDto(tl));
		}
		
		for (Meal meal : rec.getMeals()) {
			mealDtos.add(MealConverter.entityToDto(meal));
		}
		
		for (Tutorial tut : rec.getTutorials()) {
			tutDtos.add(TutorialConverter.entityToDto(tut));
		}
		
		
		recDto.setRecId(rec.getId());
		recDto.setRecName(rec.getName());
		recDto.setRecTypeDto(RecipeTypeConverter.entityToDto(rec.getType()));
		recDto.setRecPrepTime(rec.getPrepTime());
		recDto.setRecCookTime(rec.getCookTime());
		recDto.setRecRestTime(rec.getRestTime());
		recDto.setRecDietDto(DietConverter.entityToDto(rec.getDiet()));
		recDto.setRecNbPers(rec.getNbPers());
		recDto.setRecTutoId(rec.getTutoId());
		recDto.setRecPreparationDtos(preparationDtos);
		recDto.setRecToolDtos(toolDtos);
		recDto.setRecMealDtos(mealDtos);
		recDto.setRecTutorialDtos(tutDtos);
		
		return recDto;
	}
}
