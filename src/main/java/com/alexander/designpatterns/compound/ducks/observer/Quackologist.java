package com.alexander.designpatterns.compound.ducks.observer;

public class Quackologist implements Observer {

	@Override
	public void update(QuackObservable quackObservable) {
		System.out.println("Quackologist: " + quackObservable + " just quacked.");
	}

	public String toString(){
		return "Quackologist";
	}
}
