package com.alexander.designpatterns.decorator;

public abstract class Beverage {
	String description = "Unknown Beverage";
	
	public Beverage(){
		
	}
	
	public String getDescription(){
		return this.description;
	}
	
	public abstract double cost();
}
