package com.alexander.designpatterns.compound.ducks.decorator;

import com.alexander.designpatterns.compound.ducks.observer.Observable;
import com.alexander.designpatterns.compound.ducks.observer.Observer;
import com.alexander.designpatterns.compound.ducks.observer.Quackable;

public class QuackCounter implements Quackable {

	private static int numberOfQuacks = 0;
	private Quackable duck;
	
	public QuackCounter(Quackable duck){
		this.duck = duck;
	}
	
	public static int getQuacks(){
		return numberOfQuacks;
	}
	
	@Override
	public void registerObservable(Observer observer) {
		this.duck.registerObservable(observer);
	}

	@Override
	public void notifyObservers() {
		this.duck.notifyObservers();		
	}

	@Override
	public void quack() {
		duck.quack();
		numberOfQuacks++;
	}

	public String toString(){
		return duck.toString();
	}
}
