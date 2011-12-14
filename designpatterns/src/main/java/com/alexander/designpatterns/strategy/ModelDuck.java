package com.alexander.designpatterns.strategy;

import org.apache.log4j.Logger;

import com.alexander.designpatterns.strategy.interfaces.behaviours.FlyNoWay;
import com.alexander.designpatterns.strategy.interfaces.behaviours.Quack;

public class ModelDuck extends Duck {

	private Logger logger = Logger.getLogger(ModelDuck.class);
	
	public ModelDuck(){
		flyBehaviour 	= new FlyNoWay();
		quackBehaviour 	= new Quack();
	}
	
	@Override
	public void display() {
		logger.info("I'm a model duck!");

	}

}
