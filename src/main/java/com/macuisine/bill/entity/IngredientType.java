package com.macuisine.bill.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class IngredientType implements Serializable {

	private static final long serialVersionUID = 8106243692234258959L;
	
	@Column(name="ingtyp_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private Integer id;
	
	@Column(name="ingtyp_name")
	private String name;
	
	@OneToMany(mappedBy="ingredientType", cascade=CascadeType.ALL)
	private Set<Ingredient> ingredients;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Ingredient> getIngredients() {
		return ingredients;
	}

	public void setIngredients(Set<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
