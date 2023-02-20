package com.alexander.designpatterns.composite;

public abstract class MenuComponent {
	//We have transparency since both subclasses have all the menu component methods.
	//But we can't guarantee that the client won't call methods on the children that aren't appropriate
	//e.g. calling remove on a menuItem or getPrice on a Menu
	
	//Composite methods used to manipulate the data structure
	public void add(MenuComponent menuComponent){
		throw new UnsupportedOperationException();
	}
	
	public void remove(MenuComponent menuComponent){
		throw new UnsupportedOperationException();
	}
	
	public MenuComponent getChild(int i){
		throw new UnsupportedOperationException();
	}
	
	//Operation methods used by MenuItems
	public String getName(){
		throw new UnsupportedOperationException();
	}
	
	public String getDescription(){
		throw new UnsupportedOperationException();
	}
	
	public double getPrice(){
		throw new UnsupportedOperationException();
	}
	
	public boolean isVegetarian(){
		throw new UnsupportedOperationException();
	}
	
	public void print(){
		throw new UnsupportedOperationException();
	}
}
