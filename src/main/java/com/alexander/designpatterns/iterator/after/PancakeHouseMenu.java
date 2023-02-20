package com.alexander.designpatterns.iterator.after;

import java.util.ArrayList;

import com.alexander.designpatterns.iterator.before.MenuItem;

public class PancakeHouseMenu implements Menu{

	public ArrayList<MenuItem> menuItems;
	
	public PancakeHouseMenu(){
		this.menuItems = new ArrayList<MenuItem>(); 
	
		addItem("K&B's Pancake Breakfast",
				"Pancakes with scrambled eggs and toast",
				true,
				2.99);
		addItem("Regular Pancake Breakfast",
				"Pancakes with fried eggs, sausage",
				false,
				2.99);
		addItem("Blueberry Pancakes",
				"Pancakes made with fresh blueberries",
				true,
				3.49);
		addItem("Waffles",
				"Waffles, with your choice of blueberries or strawberries",
				true,
				3.59);
	}
	
	public void addItem(String name, String description, boolean vegetation, double price){
		MenuItem menuItem = new MenuItem(name, description, vegetation, price);
		menuItems.add(menuItem);
	}
	
//	public ArrayList<MenuItem> getMenuItems(){
//		return menuItems;
//	}
	
	public Iterator createIterator(){
		return new PancakeHouseIterator(menuItems);
	}
	
	@Override
	public java.util.Iterator createUtilIterator(){
		return new PancakeHouseIterator(menuItems);
	}
}
