package com.alexander.designpatterns.compound.ducks.decorator;

import com.alexander.designpatterns.compound.ducks.observer.Observable;
import com.alexander.designpatterns.compound.ducks.observer.Observer;
import com.alexander.designpatterns.compound.ducks.observer.Quackable;

public class QuackCounter implements Quackable {

	private Observable observable;
	private int quacks = 0;
	private Quackable duck;
	
	public QuackCounter(Quackable duck){
		this.duck = duck;
	}
	
	public int getQuacks(){
		return quacks;
	}
	
	public QuackCounter(){
		this.observable = new Observable(this);
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
		quacks++;
		duck.quack();
	}

}
