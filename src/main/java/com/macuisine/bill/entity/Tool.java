package com.macuisine.bill.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Tool implements Serializable {

	private static final long serialVersionUID = 8322956486518329122L;

	@Column(name="tool_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private Integer id;
	
	@Column(name="tool_name")
	private String name;
	
	@ManyToOne
	@JoinColumn(name="tool_type")
	private ToolType type;
	
	@ManyToMany(mappedBy = "tools")
	private Set<Recipe> recipes;
	
	public Tool() {
	}

	public Tool(Integer id, String name, ToolType type, Set<Recipe> recipes) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
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

	public ToolType getType() {
		return type;
	}

	public void setType(ToolType type) {
		this.type = type;
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
