package com.macuisine.bill.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class ToolType implements Serializable {

	private static final long serialVersionUID = -4542183375404680495L;
	
	@Column(name="tltyp_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private Integer id;
	
	@Column(name="tltyp_name")
	private String name;
	
	@OneToMany(mappedBy="type", cascade=CascadeType.ALL)
	private Set<Tool> tools;

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

	public Set<Tool> getTools() {
		return tools;
	}

	public void setTools(Set<Tool> tools) {
		this.tools = tools;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
