package com.alexander.designpatterns.compound.ducks.factory;

import com.alexander.designpatterns.compound.ducks.observer.Quackable;

public interface AbstractDuckFactory {
	public Quackable createMallardDuck();
	public Quackable createRedheadDuck();
	public Quackable createDuckCall();
	public Quackable createRubberDuck();
}
