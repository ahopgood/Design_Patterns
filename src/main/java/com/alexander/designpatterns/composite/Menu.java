package com.alexander.designpatterns.composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {

	private ArrayList<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
	private String name;
	private String description;
	
	public Menu(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}
	
	//Composite methods
	public void add(MenuComponent menuComponent){
		this.menuComponents.add(menuComponent);
	}
	
	public void remove(MenuComponent menuComponent){
		this.menuComponents.remove(menuComponent);
	}
	
	public MenuComponent getChild(int i){
		return this.menuComponents.get(i);
	}
	
	//Operation methods
	public String getName(){
		return name;
	}
	
	public String getDescription(){
		return description;
	}
	
	public void print(){
		System.out.print("\n" + getName());
		System.out.println(", " + getDescription());
		System.out.println("----------------------");
		
		Iterator<MenuComponent> iterator = menuComponents.iterator();
		while(iterator.hasNext()){
			MenuComponent menuComponent = (MenuComponent)iterator.next();
			menuComponent.print();
		}
	}
}
