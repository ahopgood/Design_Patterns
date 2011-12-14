package com.alexander.designpatterns.strategy.interfaces.behaviours;

import org.apache.log4j.Logger;

import com.alexander.designpatterns.strategy.interfaces.FlyBehaviour;

public class FlyNoWay implements FlyBehaviour {

	private Logger logger = Logger.getLogger(FlyNoWay.class);
	
	public void fly() {
		logger.info("I can't fly");
	}
}
