package com.alexander.designpatterns.compound.ducks.quackables;

import com.alexander.designpatterns.compound.ducks.observer.Observable;
import com.alexander.designpatterns.compound.ducks.observer.Observer;
import com.alexander.designpatterns.compound.ducks.observer.Quackable;

public class DecoyDuck implements Quackable {

	private Observable observable;
	
	public DecoyDuck(){
		observable = new Observable(this);
	}
	
	@Override
	public void registerObservable(Observer observer) {
		this.observable.registerObservable(observer);
	}

	@Override
	public void notifyObservers() {
		this.observable.notifyObservers();
	}

	@Override
	public void quack() {
		System.out.println("<< Silence >>");
		notifyObservers();
	}

	public String toString(){
		return "Decoy Duck";
	}
}
