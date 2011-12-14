package com.alexander.designpatterns.decorator.decorators;

import com.alexander.designpatterns.decorator.Beverage;
import com.alexander.designpatterns.decorator.CondimentDecorator;

public class Soy extends CondimentDecorator {

	Beverage beverage;
	
	public Soy(Beverage beverage){
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		return 0.15 + beverage.cost();
	}

}
