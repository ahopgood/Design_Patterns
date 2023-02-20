package com.alexander.designpatterns.adapter;

import com.alexander.designpatterns.adapter.interfaces.Duck;

public class MallardDuck implements Duck {
	
	@Override
	public void quack() {
		System.out.println("Quack");

	}

	@Override
	public void fly() {
		System.out.println("I'm Flying");
	}

}
