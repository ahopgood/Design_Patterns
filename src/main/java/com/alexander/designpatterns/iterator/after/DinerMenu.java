package com.alexander.designpatterns.iterator.after;

import com.alexander.designpatterns.iterator.before.MenuItem;

public class DinerMenu implements Menu {

	public final int MAX_ITEMS = 6;
	public int numberOfItems = 0;
	public MenuItem[] menuItems;
	
	public DinerMenu(){
		menuItems = new MenuItem[MAX_ITEMS];
		
		addItem("Vegetarian BLT",
				"(Fakin') Bacon with lettuce & tomato on whole wheat",
				true,
				2.99);
		addItem("BLT",
				"Bacon with lettuce & tomato on whole wheat",
				false,
				2.99);
		addItem("Soup of the day",
				"Soup of the day, with a side of potato salad",
				false,
				3.29);
		addItem("Hotdog",
				"A hot dog, with saurkraut, relish, onions, topped with cheese",
				false,
				3.05);
		addItem("Bacon & Chicken sarnie",
				"A sandwich with bacon, chicken and mayo on whole wheat",
				false,
				3.40);
		addItem("Curly Fries",
				"A bucket of lightly spiced curly fries topped with cheese and bacon with a side of spicey mayo",
				false,
				1.99);
	}
	
	public void addItem(String name, String description, boolean vegetarian, double price){
		MenuItem item = new MenuItem(name, description, vegetarian, price);
		if (numberOfItems > MAX_ITEMS){
			System.err.println("Sorry, menu is full! Can't add item to menu");
		} else {
			menuItems[numberOfItems] = item;
			numberOfItems = numberOfItems + 1;
		}
	}
	
//	public MenuItem[] getMenuItems(){
//		return menuItems;
//	}
	
	public Iterator createIterator(){
		return new DinerMenuIterator(menuItems);
	}
	
	@Override
	public java.util.Iterator<MenuItem> createUtilIterator(){
		return new DinerMenuIterator(menuItems);
	}
}
