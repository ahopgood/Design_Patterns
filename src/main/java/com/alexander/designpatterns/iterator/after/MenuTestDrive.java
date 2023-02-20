package com.alexander.designpatterns.iterator.after;

public class MenuTestDrive {

	public static void main(String[] arg){
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		CafeMenu cafeMenu = new CafeMenu();
		
		IteratorWaitress waitress = new IteratorWaitress(pancakeHouseMenu, dinerMenu, cafeMenu);
		
		waitress.printMenu();
	}
}
