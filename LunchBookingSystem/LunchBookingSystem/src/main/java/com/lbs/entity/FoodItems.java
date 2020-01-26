package com.lbs.entity;

import java.util.List;

import javax.persistence.OneToMany;

public class FoodItems {
	int id;
	String name;
	
	@OneToMany(mappedBy = "foodItems")
	private List<FoodType> foodTypes;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
