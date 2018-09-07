package com.macuisine.bill.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.macuisine.bill.entity.Recipe;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Integer> {

}