package com.alexander.designpatterns.strategy.interfaces.behaviours;

import org.apache.log4j.Logger;

import com.alexander.designpatterns.strategy.interfaces.QuackBehaviour;

public class MuteQuack implements QuackBehaviour {

	private Logger logger = Logger.getLogger(MuteQuack.class);
	
	public void quack() {
		logger.info("<< Silence >>");
	}
}
