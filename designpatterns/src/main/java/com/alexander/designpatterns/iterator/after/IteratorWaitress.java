package com.alexander.designpatterns.iterator.after;

import com.alexander.designpatterns.iterator.before.MenuItem;

public class IteratorWaitress {

	private Menu dinerMenu;
	private Menu pancakeHouseMenu;
	private Menu cafeMenu;
	
	public IteratorWaitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu){
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
		this.cafeMenu = cafeMenu;
	}
	
	public void printMenu(){
		Iterator pancakeIterator = this.pancakeHouseMenu.createIterator();
		Iterator dinerMenuIterator = this.dinerMenu.createIterator();
		Iterator cafeMenuIterator = this.cafeMenu.createIterator();
		
		System.out.println("MENU\n----\nBREAKFAST");
		printMenu(pancakeIterator);
		System.out.println("\nLUNCH");
		printMenu(dinerMenuIterator);
		System.out.println("\nDINNER");
		printMenu(cafeMenuIterator);
	}
	
	private void printMenu(Iterator iterator){
		while(iterator.hasNext()){
			MenuItem menuItem = (MenuItem)iterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
	}
	
	private void printMenu(java.util.Iterator iterator){
		while(iterator.hasNext()){
			MenuItem menuItem = (MenuItem)iterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
	}
	
	public void printBreakfastMenu(){
		System.out.println("MENU\n ---- \nBREAKFAST");
		Iterator pancakeHouseMenu = this.pancakeHouseMenu.createIterator();
		printMenu(pancakeHouseMenu);
	}
	
	public void printLunchMenu(){
		System.out.println("MENU\n ---- \nLUNCH");
		Iterator dinerMenuIterator = dinerMenu.createIterator();
		printMenu(dinerMenuIterator);
	}
	
	public void printVegetarianMenu(){
		Iterator pancakeIterator = this.pancakeHouseMenu.createIterator();
		Iterator dinerMenuIterator = this.dinerMenu.createIterator();
		System.out.println("MENU\n ---- \nVEGETARIAN");
		printVegetarianMenu(pancakeIterator);
		printVegetarianMenu(dinerMenuIterator);
	}
	
	public void printVegetarianMenu(Iterator iterator){
		while(iterator.hasNext()){
			MenuItem menuItem = (MenuItem)iterator.next();
			if (menuItem.isVegetation()){
				System.out.print(menuItem.getName() + ", ");
				System.out.print(menuItem.getPrice() + " -- ");
				System.out.println(menuItem.getDescription());
			}
		}
	}
	
	public boolean isItemVegetarian(String name){
		boolean result = false;
		result = isItemVegetarian(pancakeHouseMenu.createIterator());
		if (!result){
			result = isItemVegetarian(dinerMenu.createIterator());
		}
		return result;
	}
	
	public boolean isItemVegetarian(Iterator iterator){
		boolean result = false;
		while(iterator.hasNext()){
			MenuItem menuItem = (MenuItem)iterator.next();
			result = menuItem.isVegetation();
		}
		return result;
	}
	
}
