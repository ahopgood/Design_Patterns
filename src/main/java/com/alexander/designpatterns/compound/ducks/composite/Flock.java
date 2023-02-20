package com.alexander.designpatterns.compound.ducks.composite;

import java.util.ArrayList;

import com.alexander.designpatterns.compound.ducks.observer.Observable;
import com.alexander.designpatterns.compound.ducks.observer.Observer;
import com.alexander.designpatterns.compound.ducks.observer.Quackable;

public class Flock implements Quackable {

	private ArrayList<Quackable> quackables = new ArrayList<Quackable>();
		
	public void add(Quackable quackable){
		this.quackables.add(quackable);
	}
	
	@Override
	public void quack() {
		for (Quackable quackable : this.quackables){
			quackable.quack();
		}
	}

	@Override
	public void registerObservable(Observer observer) {
		for (Quackable quackable : this.quackables){
			quackable.registerObservable(observer);
		}
	}

	@Override
	public void notifyObservers() {
//		for (Quackable quackable : this.quackables){
//			quackable.notifyObservers();
//		}
	}

	public String toString(){
		return "Flock of Ducks";
	}
}
