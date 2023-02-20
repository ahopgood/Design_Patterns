package com.alexander.designpatterns.strategy;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import com.alexander.designpatterns.strategy.interfaces.FlyBehaviour;
import com.alexander.designpatterns.strategy.interfaces.QuackBehaviour;

public abstract class Duck {

	private static Logger logger = Logger.getLogger(Duck.class);
	
	FlyBehaviour flyBehaviour;
	QuackBehaviour quackBehaviour;
	
	public void swim(){
		System.out.println("All ducks float, even decoys!");
	}
	
	public void performQuack(){
		quackBehaviour.quack();
	}
	
	public void performFly(){
		flyBehaviour.fly();
	}
	
	public void setFlyBehaviour(FlyBehaviour fly){
		this.flyBehaviour = fly;
	}
	
	public void setQuackBehaviour(QuackBehaviour quack){
		this.quackBehaviour = quack;
	}
	
	public abstract void display();
	
	public static void main (String[] args){
		BasicConfigurator.configure();
		
		logger.info("Hello we're in the main method");
	}
}
