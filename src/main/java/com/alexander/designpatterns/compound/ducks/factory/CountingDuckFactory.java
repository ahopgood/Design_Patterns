package com.alexander.designpatterns.compound.ducks.factory;

import com.alexander.designpatterns.compound.ducks.decorator.QuackCounter;
import com.alexander.designpatterns.compound.ducks.observer.Quackable;
import com.alexander.designpatterns.compound.ducks.quackables.DuckCall;
import com.alexander.designpatterns.compound.ducks.quackables.MallardDuck;
import com.alexander.designpatterns.compound.ducks.quackables.RedheadDuck;
import com.alexander.designpatterns.compound.ducks.quackables.RubberDuck;

public class CountingDuckFactory implements AbstractDuckFactory {

	@Override
	public Quackable createMallardDuck() {
		return new QuackCounter(new MallardDuck());
	}

	@Override
	public Quackable createRedheadDuck() {
		return new QuackCounter(new RedheadDuck());
	}

	@Override
	public Quackable createDuckCall() {
		return new QuackCounter(new DuckCall());
	}

	@Override
	public Quackable createRubberDuck() {
		return new QuackCounter(new RubberDuck());
	}

}
