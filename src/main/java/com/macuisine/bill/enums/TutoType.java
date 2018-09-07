package com.macuisine.bill.enums;

public enum TutoType {
	TEXT("text"),
	VIDEO("video");
	
	private String type;
	
	private TutoType(String type) {
		this.setType(type);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
