package com.alexander.designpatterns.iterator.after;

import java.util.Hashtable;

import com.alexander.designpatterns.iterator.before.MenuItem;

public class CafeMenu implements Menu {

	private Hashtable<String, MenuItem> menuItems = new Hashtable<String, MenuItem>();
	
	public CafeMenu(){
		addItem("Veggie Burger and Air Fries",
				"Veggie Burger on a whole wheat bun, lettuce, tomato and fries",
				true,
				3.99);
		addItem("Soup of the day",
				"A cup of the soup of the day, with a side salad",
				false,
				3.69);
		addItem("Burrito",
				"A large burrito, with whole pinto beans, salsa, guacamole",
				true,
				4.29);
	}
	
	public void addItem(String name, String description, boolean vegetarian, double price){
		MenuItem item = new MenuItem(name, description, vegetarian, price);
		menuItems.put(item.getName(), item);
	}
	
	public Hashtable<String, MenuItem> getItems(){
		return menuItems;
	}

	@Override
	public Iterator createIterator() {
		return new CafeMenuIterator(menuItems);
//		return menuItems.values().iterator();
	}
	
	@Override
	public java.util.Iterator createUtilIterator(){
		return menuItems.values().iterator();
	}
}
