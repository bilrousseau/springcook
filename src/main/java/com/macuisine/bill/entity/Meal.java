package com.macuisine.bill.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Meal implements Serializable {

	private static final long serialVersionUID = -2951480994523123105L;
	
	@Column(name="meal_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="meal_recid")
	private Recipe recipe;
	
	@Temporal(TemporalType.DATE)
	@Column(name="meal_date")
	private Date date;
	
	@Column(name="meal_grade")
	private Integer grade;
	
	public Meal() {
		super();
	}
	
	public Meal(Integer id, Recipe recipe, Date date, Integer grade) {
		super();
		this.id = id;
		this.recipe = recipe;
		this.date = date;
		this.grade = grade;
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getGrade() {
		return grade;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
