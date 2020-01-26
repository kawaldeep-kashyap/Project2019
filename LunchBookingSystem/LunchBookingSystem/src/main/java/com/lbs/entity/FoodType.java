package com.lbs.entity;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class FoodType {
	int typeid;
	int id;
	String Type;
	
	@ManyToOne
	private FoodItems foodItems;
	public int getTypeid() {
		return typeid;
	}
	public void setTypeid(int typeid) {
		this.typeid = typeid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	
	

}
