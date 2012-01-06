package com.alexander.designpatterns.composite.iterator;

import java.util.Iterator;
import com.alexander.designpatterns.composite.iterator.MenuComponent;


public class MenuItem extends MenuComponent{
	private String name;
	private String description;
	private boolean vegetarian;
	private double price;
	
	public MenuItem(String name, String description, boolean vegetarian,
			double price) {
		super();
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public double getPrice() {
		return price;
	}

	public void print(){
		System.out.print("  " + getName());
		if (isVegetarian()){
			System.out.print("(v)");
		}
		System.out.println(", " + getPrice());
		System.out.println("    -- " + getDescription());
	}
	
	public Iterator<MenuComponent> createIterator(){
		return new NullIterator();
	}
}
