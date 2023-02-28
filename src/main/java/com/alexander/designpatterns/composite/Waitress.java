package com.alexander.designpatterns.composite;

import java.util.Iterator;

import com.alexander.designpatterns.composite.iterator.MenuComponent;

public class Waitress {

	private MenuComponent allMenus;
	
	public Waitress(MenuComponent allMenus){
		this.allMenus = allMenus;
	}
	
	public void printMenu(){
		allMenus.print();
	}
	
	public void printVegetarianMenu(){
		Iterator<MenuComponent> iterator = allMenus.createIterator();
		System.out.println("\nVEGETARIAN MENU\n----");
		
		while (iterator.hasNext()){
			MenuComponent menuComponent = (MenuComponent)iterator.next();
			try{
				if (menuComponent.isVegetarian()){
					//call isVegetarian on every MenuComponent to maintain transparency
					menuComponent.print();
				}
			} catch (UnsupportedOperationException e){
				//implemented on menus to throw an exception but we're ok with it so we carry on.
				//We want to show that this is currently unsupported on menus but someone could later implement it.
				//Could create our own exception to throw instead?
			}
		}
	}
}
