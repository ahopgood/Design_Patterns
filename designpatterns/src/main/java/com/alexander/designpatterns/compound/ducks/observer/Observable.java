package com.alexander.designpatterns.compound.ducks.observer;

import java.util.ArrayList;

public class Observable implements QuackObservable {

	private ArrayList<Observer> observers = new ArrayList<Observer>();
	private QuackObservable duck;

	public Observable(QuackObservable duck){
		this.duck = duck;
	}
	
	@Override
	public void notifyObservers() {

	}

	@Override
	public void registerObservable(Observer observer) {
		this.observers.add(observer);		
	}
}
