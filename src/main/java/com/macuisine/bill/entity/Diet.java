package com.macuisine.bill.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Diet implements Serializable {

	private static final long serialVersionUID = 4862359398962061457L;
	
	@Column(name="diet_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private Integer id;
	
	@Column(name="diet_name")
	private String name;
	
	@OneToMany(mappedBy="diet", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private Set<Recipe> recipes;
	
	
	public Diet() {
		super();
	}
	
	public Diet(Integer id, String name, Set<Recipe> recipes) {
		super();
		this.id = id;
		this.name = name;
		this.recipes = recipes;
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
	public Set<Recipe> getRecipes() {
		return recipes;
	}
	public void setRecipes(Set<Recipe> recipes) {
		this.recipes = recipes;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
