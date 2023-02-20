package com.alexander.designpatterns.decorator.decorators;

import com.alexander.designpatterns.decorator.Beverage;
import com.alexander.designpatterns.decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {

	Beverage beverage;
	
	public Mocha(Beverage beverage){
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		return 0.20 + beverage.cost();
	}

}
