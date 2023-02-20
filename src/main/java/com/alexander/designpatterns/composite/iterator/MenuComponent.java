package com.alexander.designpatterns.composite.iterator;

import java.util.Iterator;
import com.alexander.designpatterns.composite.iterator.MenuComponent;

public abstract class MenuComponent {

	//Operation methods used by menuItem
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
	
	//Composite methods
	public void add(MenuComponent component){
		throw new UnsupportedOperationException();
	}
	
	public void remove(MenuComponent component){
		throw new UnsupportedOperationException();
	}
	
	public MenuComponent getChild(int child){
		throw new UnsupportedOperationException();
	}
	
	public Iterator<MenuComponent> createIterator(){
		throw new UnsupportedOperationException();
	}
}
