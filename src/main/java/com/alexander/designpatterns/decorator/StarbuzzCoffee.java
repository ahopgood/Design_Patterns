package com.alexander.designpatterns.decorator;

import java.util.logging.Logger;

import org.apache.log4j.BasicConfigurator;

import com.alexander.designpatterns.decorator.decorators.Mocha;
import com.alexander.designpatterns.decorator.decorators.Whip;

public class StarbuzzCoffee {

	private static Logger logger = Logger.getLogger(StarbuzzCoffee.class.getName());
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BasicConfigurator.configure();
		Beverage beverage = new Espresso();
		logger.info(beverage.getDescription() + " $" + beverage.cost());

		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		logger.info(beverage2.getDescription() + " $" + beverage2.cost());

		Beverage beverage3 = new HouseBlend();
		beverage2 = new Mocha(beverage3);
		beverage2 = new Mocha(beverage3);
		beverage2 = new Whip(beverage3);
		logger.info(beverage3.getDescription() + " $" + beverage3.cost());
	}

}
