package com.alexander.designpatterns.iterator.before;

import java.util.ArrayList;

public class Waitress {

	ArrayList<MenuItem> breakfastItems;
	MenuItem[] lunchItems;
	
	public static void main(String[] args){
		PancakeHouseMenu pancake = new PancakeHouseMenu();
		DinerMenu diner = new DinerMenu();
		
		Waitress waitress = new Waitress(pancake.getMenuItems(),diner.getMenuItems());
		
		waitress.printMenu();
		waitress.printBreakfastMenu();
		waitress.printLunchMenu();
		waitress.printVegetarianMenu();
		System.out.println("Is Vegetarian BLT vegetarian? " + waitress.isItemVegetarian("Vegetarian BLT"));
	}
	
	public Waitress(ArrayList<MenuItem> breakfastItems, MenuItem[] lunchItems){
		this.breakfastItems = breakfastItems;
		this.lunchItems = lunchItems;
	}
	
	public void printMenu(){
		for (int i = 0; i < breakfastItems.size(); i++){
			MenuItem menuItem = (MenuItem)breakfastItems.get(i);
			System.out.println(menuItem.getName() + " ");
			System.out.println(menuItem.getPrice() + " ");
			System.out.println(menuItem.getDescription());
		}
		
		for (int i = 0; i < lunchItems.length; i++){
			MenuItem menuItem = lunchItems[i];
			System.out.println(menuItem.getName() + " ");
			System.out.println(menuItem.getPrice() + " ");
			System.out.println(menuItem.getDescription());
		}
	}
	
	public void printBreakfastMenu(){
		for (int i = 0; i < breakfastItems.size(); i++){
			MenuItem menuItem = (MenuItem)breakfastItems.get(i);
			System.out.println(menuItem.getName() + " ");
			System.out.println(menuItem.getPrice() + " ");
			System.out.println(menuItem.getDescription());
		}
	}
	
	public void printLunchMenu(){
		for (int i = 0; i < lunchItems.length; i++){
			MenuItem menuItem = lunchItems[i];
			System.out.println(menuItem.getName() + " ");
			System.out.println(menuItem.getPrice() + " ");
			System.out.println(menuItem.getDescription());
		}
	}
	
	public void printVegetarianMenu(){
		for (int i = 0; i < breakfastItems.size(); i++){
			MenuItem menuItem = (MenuItem)breakfastItems.get(i);
			if (menuItem.isVegetation()){
				System.out.println(menuItem.getName() + " ");
				System.out.println(menuItem.getPrice() + " ");
				System.out.println(menuItem.getDescription());
			}
		}
		
		for (int i = 0; i < lunchItems.length; i++){
			MenuItem menuItem = lunchItems[i];
			if (menuItem.isVegetation()){
				System.out.println(menuItem.getName() + " ");
				System.out.println(menuItem.getPrice() + " ");
				System.out.println(menuItem.getDescription());
			}
		}
	}
	
	public boolean isItemVegetarian(String name){
		boolean result = false;
		for (int i = 0; i < this.breakfastItems.size(); i++){
			MenuItem item = this.breakfastItems.get(i);
			if (item.name.equals(name)){
				if (item.isVegetation()){
					result = true;
				}
			}
		}
		
		for (int i = 0; i < this.lunchItems.length; i++){
			MenuItem item = this.lunchItems[i];
			if (item.name.equals(name)){
				if (item.isVegetation()){
					result = true;
				}
			}
		}
		return result;
	}
}
