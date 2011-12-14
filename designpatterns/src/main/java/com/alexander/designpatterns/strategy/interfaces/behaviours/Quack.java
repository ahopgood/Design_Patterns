package com.alexander.designpatterns.strategy.interfaces.behaviours;

import org.apache.log4j.Logger;

import com.alexander.designpatterns.strategy.interfaces.QuackBehaviour;

public class Quack implements QuackBehaviour {
	
	private Logger logger = Logger.getLogger(Quack.class);
	
	public void quack() {
		logger.info("Quack");
	}
}
