package com.alexander.designpatterns.compound.ducks.adapter;

import com.alexander.designpatterns.compound.ducks.observer.Observable;
import com.alexander.designpatterns.compound.ducks.observer.Observer;
import com.alexander.designpatterns.compound.ducks.observer.Quackable;

public class GooseAdapter implements Quackable {

	private Goose goose;
	private Observable observable;
	
	public GooseAdapter(Goose goose){
		this.goose = goose;
		this.observable = new Observable(this);
	}
	
	@Override
	public void quack() {
		goose.honk();
		notifyObservers();
	}

	@Override
	public void notifyObservers() {
		this.observable.notifyObservers();
	}

	@Override
	public void registerObservable(Observer observer) {
		this.observable.registerObservable(observer);	
	}
	
	public String toString(){
		return "Goose pretending to be a Duck";
	}
}
