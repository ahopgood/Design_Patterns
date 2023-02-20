package com.alexander.designpatterns.composite;

import com.alexander.designpatterns.composite.iterator.MenuComponent;
import com.alexander.designpatterns.composite.iterator.Menu;
import com.alexander.designpatterns.composite.iterator.MenuItem;

public class MenuTestDrive {
	
	public static void main (String[] args){
		MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
		
		MenuComponent dinerMenu = new Menu("DINER MENU","Lunch");
		
		MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
		
		MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");
		
		MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
		
		allMenus.add(pancakeHouseMenu);
		allMenus.add(dinerMenu);
		allMenus.add(cafeMenu);
		
		//add menu items here
		
		dinerMenu.add(new MenuItem("Pasta",
				"Spaghetti with Marinara Sauce, and a slice of sourdough bread",
				true,
				3.89));
		dinerMenu.add(new MenuItem("Vegetarian BLT",
				"(Fakin') Bacon with lettuce & tomato on whole wheat",
				true,
				2.99));
		dinerMenu.add(new MenuItem("BLT",
				"Bacon with lettuce & tomato on whole wheat",
				false,
				2.99));
		dinerMenu.add(new MenuItem("Soup of the day",
				"Soup of the day, with a side of potato salad",
				false,
				3.29));
		dinerMenu.add(new MenuItem("Hotdog",
				"A hot dog, with saurkraut, relish, onions, topped with cheese",
				false,
				3.05));
		dinerMenu.add(new MenuItem("Bacon & Chicken sarnie",
				"A sandwich with bacon, chicken and mayo on whole wheat",
				false,
				3.40));
		dinerMenu.add(new MenuItem("Curly Fries",
				"A bucket of lightly spiced curly fries topped with cheese and bacon with a side of spicey mayo",
				false,
				1.99));
		
		dessertMenu.add(new MenuItem("Apple Pie",
				"Apple Pie with a flakey crust, topped with vanilla ice cream", 
				true, 
				1.59));
		dessertMenu.add(new MenuItem("Cheesecake",
				"Creamy New York cheesecake, wioth a chocolate graham crust", 
				true, 
				1.99));
		dessertMenu.add(new MenuItem("Sorbet",
				"A scoop of raspberry and a scoop of lime", 
				true, 
				1.89));
		dinerMenu.add(dessertMenu);
		
		cafeMenu.add(new MenuItem("Veggie Burger and Air Fries",
				"Veggie Burger on a whole wheat bun, lettuce, tomato and fries",
				true,
				3.99));
		cafeMenu.add(new MenuItem("Soup of the day",
				"A cup of the soup of the day, with a side salad",
				false,
				3.69));
		cafeMenu.add(new MenuItem("Burrito",
				"A large burrito, with whole pinto beans, salsa, guacamole",
				true,
				4.29));
				
		pancakeHouseMenu.add(new MenuItem("K&B's Pancake Breakfast",
						"Pancakes with scrambled eggs and toast",
						true,
						2.99));
		pancakeHouseMenu.add(new MenuItem("Regular Pancake Breakfast",
						"Pancakes with fried eggs, sausage",
						false,
						2.99));
		pancakeHouseMenu.add(new MenuItem("Blueberry Pancakes",
						"Pancakes made with fresh blueberries",
						true,
						3.49));
		pancakeHouseMenu.add(new MenuItem("Waffles",
						"Waffles, with your choice of blueberries or strawberries",
						true,
						3.59));
		
		
		Waitress waitress = new Waitress(allMenus);
		waitress.printMenu();
		
		waitress.printVegetarianMenu();
	}
}
