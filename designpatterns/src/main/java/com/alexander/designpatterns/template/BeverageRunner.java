package com.alexander.designpatterns.template;

public class BeverageRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CaffeineBeverage tea = new Tea();
		tea.prepareRecipe();
		
		CaffeineBeverage coffee = new Coffee();
		coffee.prepareRecipe();
	}
}
