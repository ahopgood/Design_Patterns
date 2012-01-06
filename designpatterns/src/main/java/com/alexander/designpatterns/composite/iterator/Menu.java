package com.alexander.designpatterns.composite.iterator;

import java.util.ArrayList;
import java.util.Iterator;

import com.alexander.designpatterns.composite.iterator.MenuComponent;

public class Menu extends MenuComponent{
	private ArrayList<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
	private String name;
	private String description;
	private Iterator<MenuComponent> iterator;
	
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
	
	public Iterator<MenuComponent> createIterator(){
		if (iterator == null){
			iterator = new CompositeIterator(menuComponents.iterator());
		}
		return iterator;
	}
}
