package com.alexander.designpatterns.strategy.interfaces.behaviours;

import org.apache.log4j.Logger;

import com.alexander.designpatterns.strategy.interfaces.FlyBehaviour;

public class FlyWithWings implements FlyBehaviour{

	private Logger logger = Logger.getLogger(FlyWithWings.class);
	
	public void fly() {
		logger.info("I'm flying!!");
	}
}
