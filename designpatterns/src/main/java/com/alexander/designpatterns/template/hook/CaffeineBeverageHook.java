package com.alexander.designpatterns.template.hook;

/**
 * Template pattern and the Hollywood principle
 * This is our high level component, it has control over the algorithm for the recipe.
 * It calls the subclasses only when they are needed for an implementation of a method.
 * @author Alexander
 *
 */
public abstract class CaffeineBeverageHook {

	public final void prepareRecipe(){
		boilWater();
		brew();
		pourInCup();
		if (customerWantsCondiments()){
			hook();
		}
	}
	
	abstract void hook();
	abstract void brew();
	
	public void boilWater(){
		System.out.println("Boiling water");
	}
	
	public void pourInCup(){
		System.out.println("Pouring into cup");
	}
	
	//subclasses will have to override this method to decide if they want to use the hook
	public boolean customerWantsCondiments(){
		return true;
	}

}
