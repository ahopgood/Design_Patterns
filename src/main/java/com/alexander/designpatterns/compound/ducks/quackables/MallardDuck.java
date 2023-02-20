package com.alexander.designpatterns.compound.ducks.quackables;

import com.alexander.designpatterns.compound.ducks.observer.Observable;
import com.alexander.designpatterns.compound.ducks.observer.Observer;
import com.alexander.designpatterns.compound.ducks.observer.Quackable;

public class MallardDuck implements Quackable {

	private Observable observable;
	
	public MallardDuck(){
		this.observable = new Observable(this);
	}
	
	@Override
	public void quack() {
		System.out.println("Quack");
		notifyObservers();
	}

	@Override
	public void registerObservable(Observer observer) {
		this.observable.registerObservable(observer);
		
	}

	@Override
	public void notifyObservers() {
		this.observable.notifyObservers();
	}
	
	public String toString(){
		return "Mallard Duck";
	}
}
