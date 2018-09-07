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

import com.macuisine.bill.enums.TutoType;

@Entity
@Table(name="tutorial")
public class Tutorial implements Serializable {

	private static final long serialVersionUID = 4964686298950093898L;

	@Column(name="tuto_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="tuto_recid")
	private Recipe recipe;
	
	@Column(name="tuto_type")
	private TutoType tutoType;
	
	@Column(name="tuto_url")
	private String url;
	
	@Column(name="tuto_source")
	private String source;

	
	public Tutorial() {
		super();
	}


	public Tutorial(Integer id, Recipe recipe, TutoType tutoType, String url, String source) {
		super();
		this.id = id;
		this.recipe = recipe;
		this.tutoType = tutoType;
		this.url = url;
		this.source = source;
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


	public TutoType getTutoType() {
		return tutoType;
	}


	public void setTutoType(TutoType tutoType) {
		this.tutoType = tutoType;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public String getSource() {
		return source;
	}


	public void setSource(String source) {
		this.source = source;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
