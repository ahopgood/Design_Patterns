package com.alexander.designpatterns.compound.ducks.composite;

import java.util.ArrayList;

import com.alexander.designpatterns.compound.ducks.observer.Observable;
import com.alexander.designpatterns.compound.ducks.observer.Observer;
import com.alexander.designpatterns.compound.ducks.observer.Quackable;

public class Flock implements Quackable {

	private Observable observable;
	private ArrayList<Quackable> quackables = new ArrayList<Quackable>();
	
	public Flock(Observable observable){
		this.observable = observable;
	}
	
	public void add(Quackable quackable){
		this.quackables.add(quackable);
	}
	
	@Override
	public void quack() {
		
	}

	@Override
	public void registerObservable(Observer observer) {
		this.registerObservable(observer);
	}

	@Override
	public void notifyObservers() {
		this.observable.notifyObservers();
	}

}
