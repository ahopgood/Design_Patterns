package com.alexander.designpatterns.compound.ducks.observer;

public interface QuackObservable {
	public void registerObservable(Observer observer);
	public void notifyObservers();
}
