package com.macuisine.bill;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.macuisine.bill.repository.RecipeRepository;

@SpringBootApplication
public class ChezbillApplication {
	
	@Autowired
	private RecipeRepository recipeRepository;

	public static void main(String[] args) {
		SpringApplication.run(ChezbillApplication.class, args);
	}
}
