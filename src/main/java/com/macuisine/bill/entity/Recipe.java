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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="recipe")
public class Recipe implements Serializable{

	private static final long serialVersionUID = 5220818006138025977L;
	
	@Column(name="rec_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private Integer id;
	
	@Column(name="rec_name")
	private String name;
	
	@ManyToOne
	@JoinColumn(name="rec_type")
	private RecipeType type;
	
	@Column(name="rec_prep_time")
	private Integer prepTime;
	
	@Column(name="rec_cook_time")
	private Integer cookTime;
	
	@Column(name="rec_rest_time")
	private Integer restTime;
	
	@ManyToOne
	@JoinColumn(name="rec_dietid")
	private Diet diet;
	
	@Column(name="rec_nb_pers")
	private Integer nbPers;
	
	@Column(name="rec_tutoid")
	private Integer tutoId;
	
	@OneToMany(mappedBy="recipe", cascade=CascadeType.ALL)
	private Set<Preparation> preparations;
	
	@OneToMany(mappedBy="recipe", cascade=CascadeType.ALL)
	private Set<Meal> meals;
	
	@OneToMany(mappedBy="recipe", cascade=CascadeType.ALL)
	private Set<Tutorial> tutorials;
	
	@ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "recipe_tool", 
    	joinColumns = @JoinColumn(name = "rec_id", referencedColumnName = "id"), 
    	inverseJoinColumns = @JoinColumn(name = "tool_id", referencedColumnName = "id"))
	private Set<Tool> tools;
	
	public Recipe() {
	}

	public Recipe(Integer id, String name, RecipeType type, Integer prepTime, Integer cookTime, Integer restTime,
			Diet diet, Integer nbPers, Integer tutoId, Set<Preparation> preparations, Set<Meal> meals,
			Set<Tool> tools, Set<Tutorial> tutorials) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.prepTime = prepTime;
		this.cookTime = cookTime;
		this.restTime = restTime;
		this.diet = diet;
		this.nbPers = nbPers;
		this.tutoId = tutoId;
		this.preparations = preparations;
		this.meals = meals;
		this.tools = tools;
		this.tutorials = tutorials;
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

	public RecipeType getType() {
		return type;
	}

	public void setType(RecipeType type) {
		this.type = type;
	}

	public Integer getPrepTime() {
		return prepTime;
	}

	public void setPrepTime(Integer prepTime) {
		this.prepTime = prepTime;
	}

	public Integer getCookTime() {
		return cookTime;
	}

	public void setCookTime(Integer cookTime) {
		this.cookTime = cookTime;
	}

	public Integer getRestTime() {
		return restTime;
	}

	public void setRestTime(Integer restTime) {
		this.restTime = restTime;
	}

	public Diet getDiet() {
		return diet;
	}

	public void setDiet(Diet diet) {
		this.diet = diet;
	}

	public Integer getNbPers() {
		return nbPers;
	}

	public void setNbPers(Integer nbPers) {
		this.nbPers = nbPers;
	}

	public Integer getTutoId() {
		return tutoId;
	}

	public void setTutoId(Integer tutoId) {
		this.tutoId = tutoId;
	}

	public Set<Preparation> getPreparations() {
		return preparations;
	}

	public void setPreparations(Set<Preparation> preparations) {
		this.preparations = preparations;
	}

	public Set<Meal> getMeals() {
		return meals;
	}

	public void setMeals(Set<Meal> meals) {
		this.meals = meals;
	}

	public Set<Tool> getTools() {
		return tools;
	}

	public void setTools(Set<Tool> tools) {
		this.tools = tools;
	}
	
	public Set<Tutorial> getTutorials() {
		return tutorials;
	}

	public void setTutorials(Set<Tutorial> tutorials) {
		this.tutorials = tutorials;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
