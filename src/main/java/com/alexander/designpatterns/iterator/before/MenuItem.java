package com.alexander.designpatterns.iterator.before;

public class MenuItem {

	public String name;
	public String description;
	public boolean vegetation;
	public double price;
	
	public MenuItem(String name, String description, boolean vegetation, double price){
		this.name = name;
		this.description = description;
		this.vegetation = vegetation;
		this.price = price;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getDescription(){
		return this.description;
	}
	
	public boolean isVegetation(){
		return this.vegetation;
	}
	
	public double getPrice(){
		return this.price;
	}
}
