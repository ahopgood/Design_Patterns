package com.alexander.designpatterns.decorator.decorators;

import com.alexander.designpatterns.decorator.Beverage;
import com.alexander.designpatterns.decorator.CondimentDecorator;

public class Milk extends CondimentDecorator {

	Beverage beverage;
	
	public Milk(Beverage beverage){
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Steamed Milk";
	}

	@Override
	public double cost() {
		return 0.10 + beverage.cost();
	}

}
