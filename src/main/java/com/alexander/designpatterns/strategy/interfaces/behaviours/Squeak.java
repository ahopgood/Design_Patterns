package com.alexander.designpatterns.strategy.interfaces.behaviours;

import org.apache.log4j.Logger;

import com.alexander.designpatterns.strategy.interfaces.QuackBehaviour;

public class Squeak implements QuackBehaviour {

	private Logger logger = Logger.getLogger(Squeak.class);
	
//	@Override
	public void quack() {
		logger.info("Squeak");
	}
}
