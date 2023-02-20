package com.alexander.designpatterns.template.hook;

public class HookTestDrive {
	public static void main (String[] args){
		CoffeeWithHook coffeeHook = new CoffeeWithHook();
		TeaWithHook teaHook = new TeaWithHook();
		
		System.out.println("\nMaking tea...");
		teaHook.prepareRecipe();
		
		System.out.println("\nMaking coffee...");
		coffeeHook.prepareRecipe();
	}
}
