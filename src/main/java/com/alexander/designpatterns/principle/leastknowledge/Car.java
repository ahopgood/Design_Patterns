package com.alexander.designpatterns.principle.leastknowledge;

public class Car {
	//A component of this class, we can call its methods.
	Engine engine;
	
	public void start(Key key){
		//Creating a new object, its methods are legal
		Doors doors = new Doors();
		
		//You can call a method on an object passed in as a parameter
		boolean authourised = key.turns();
		
		if (authourised){
			//You can call a method on a component of the object.
			engine.start();
			//You can call a local method within an object
			updateDashboardDisplay();
			//can call a method on an object you create or instantiate
			doors.lock();
		}
	}
	
	public void updateDashboardDisplay(){
		
	}
	
}
