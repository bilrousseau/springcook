package com.macuisine.bill.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="preparation")

public class Preparation implements Serializable {

	private static final long serialVersionUID = -258429873985252895L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="prep_id")
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="prep_recid")
	private Recipe recipe;
	
	@ManyToOne
	@JoinColumn(name="prep_ingid")
	private Ingredient ingredient;
	
	@Column(name="prep_quantity")
	private Double quantity;
	
	@Column(name="prep_measure")
	private String measure;
	
	public Preparation() {
		super();
	}

	public Preparation(Integer id, Recipe recipe, Ingredient ingredient, Double quantity, String measure) {
		super();
		this.id = id;
		this.recipe = recipe;
		this.ingredient = ingredient;
		this.quantity = quantity;
		this.measure = measure;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Recipe getRecipe() {
		return recipe;
	}

	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}

	public Ingredient getIngredient() {
		return ingredient;
	}

	public void setIngredient(Ingredient ingredient) {
		this.ingredient = ingredient;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public String getMeasure() {
		return measure;
	}

	public void setMeasure(String measure) {
		this.measure = measure;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
}
