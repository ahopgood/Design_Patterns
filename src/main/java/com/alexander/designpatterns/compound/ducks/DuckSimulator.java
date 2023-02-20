package com.alexander.designpatterns.compound.ducks;

import com.alexander.designpatterns.compound.ducks.adapter.Goose;
import com.alexander.designpatterns.compound.ducks.adapter.GooseAdapter;
import com.alexander.designpatterns.compound.ducks.composite.Flock;
import com.alexander.designpatterns.compound.ducks.decorator.QuackCounter;
import com.alexander.designpatterns.compound.ducks.factory.AbstractDuckFactory;
import com.alexander.designpatterns.compound.ducks.factory.CountingDuckFactory;
import com.alexander.designpatterns.compound.ducks.observer.Quackable;
import com.alexander.designpatterns.compound.ducks.observer.Quackologist;

public class DuckSimulator {

	public static void main (String[] args){
		System.out.println("In main method");
		DuckSimulator simulator = new DuckSimulator();
		AbstractDuckFactory duckFactory = new CountingDuckFactory();
		
		simulator.simulate(duckFactory);
	}
	
	public void simulate(AbstractDuckFactory duckFactory){
		
		Quackable redheadDuck 	= duckFactory.createRedheadDuck();
		Quackable duckCall		= duckFactory.createDuckCall();
		Quackable rubberDuck	= duckFactory.createRubberDuck();
		Quackable gooseDuck		= new GooseAdapter(new Goose());
		
		Flock flockOfDucks 		= new Flock();
		flockOfDucks.add(redheadDuck);
		flockOfDucks.add(duckCall);
		flockOfDucks.add(rubberDuck);
		flockOfDucks.add(gooseDuck);
		
		Flock flockOfMallards	= new Flock();
		Quackable mallardOne	= duckFactory.createMallardDuck();
		Quackable mallardTwo	= duckFactory.createMallardDuck();
		Quackable mallardThree	= duckFactory.createMallardDuck();
		Quackable mallardFour	= duckFactory.createMallardDuck();
		
		flockOfMallards.add(mallardOne);
		flockOfMallards.add(mallardTwo);
		flockOfMallards.add(mallardThree);
		flockOfMallards.add(mallardFour);
		
		flockOfDucks.add(flockOfMallards);
		
		System.out.println("\nDuck Simulator: With Observer");
		
		Quackologist quackologist = new Quackologist();
		flockOfDucks.registerObservable(quackologist);
		
		simulate(flockOfDucks);
		
		System.out.println("\nThe ducks quacked " + 
							QuackCounter.getQuacks() + 
							" times.");
	}
	
	public void simulate(Quackable duck){
		duck.quack();
	}
}