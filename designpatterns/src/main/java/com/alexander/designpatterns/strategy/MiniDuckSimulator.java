package com.alexander.designpatterns.strategy;

import org.apache.log4j.BasicConfigurator;

import com.alexander.designpatterns.strategy.interfaces.behaviours.FlyRocketPowered;

public class MiniDuckSimulator {

	public static void main(String[] args){
		BasicConfigurator.configure();
		
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehaviour(new FlyRocketPowered());
		model.performFly();
	}
}
