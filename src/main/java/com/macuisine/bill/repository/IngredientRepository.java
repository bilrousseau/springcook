package com.macuisine.bill.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.macuisine.bill.entity.Ingredient;

public interface IngredientRepository extends JpaRepository<Ingredient, Integer> {

}
