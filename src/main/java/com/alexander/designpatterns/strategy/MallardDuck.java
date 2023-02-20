package com.alexander.designpatterns.strategy;

import com.alexander.designpatterns.strategy.interfaces.behaviours.FlyWithWings;
import com.alexander.designpatterns.strategy.interfaces.behaviours.Quack;

public class MallardDuck extends Duck {

	public MallardDuck(){
		quackBehaviour 	= new Quack();
		flyBehaviour 	= new FlyWithWings();
	}
	
	@Override
	public void display() {
		System.out.println("I'm a real Mallard duck....");

	}
}
