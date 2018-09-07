package com.macuisine.bill.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Ingredient implements Serializable{

	private static final long serialVersionUID = 1882765074297893761L;
	
	@Column(name="ing_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private Integer id;
	
	@Column(name="ing_name")
	private String name;
	
	@ManyToOne
	@JoinColumn(name="ing_type")
	private IngredientType ingredientType;
	
	@Column(name="ing_kcal")
	private Integer kcal;
	
	@OneToMany(mappedBy="ingredient", cascade=CascadeType.ALL)
	private Set<Preparation> preparations;
	
	public Ingredient() {
		super();
	}

	public Ingredient(Integer id, String name, IngredientType ingredientType, Integer kcal,
			Set<Preparation> preparations) {
		super();
		this.id = id;
		this.name = name;
		this.ingredientType = ingredientType;
		this.kcal = kcal;
		this.preparations = preparations;
	}

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

	public IngredientType getIngredientType() {
		return ingredientType;
	}

	public void setIngredientType(IngredientType ingredientType) {
		this.ingredientType = ingredientType;
	}

	public Integer getKcal() {
		return kcal;
	}

	public void setKcal(Integer kcal) {
		this.kcal = kcal;
	}

	public Set<Preparation> getPreparations() {
		return preparations;
	}

	public void setPreparations(Set<Preparation> preparations) {
		this.preparations = preparations;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	
}
