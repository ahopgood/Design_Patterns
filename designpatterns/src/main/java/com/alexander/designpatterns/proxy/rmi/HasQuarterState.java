package com.alexander.designpatterns.proxy.rmi;

import java.util.Random;

public class HasQuarterState implements State {

	private transient GumballMachine gumballMachine;
	private Random randomNumber = new Random(System.currentTimeMillis());
	
	public HasQuarterState(GumballMachine gumballMachine){
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("You can't insert another quarter");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Quarter returned");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}
	
	@Override
	public void turnCrank() {
		System.out.println("You turned.....");
		//state change is moved to accomodate the random 1 in 10 winner concept
//		gumballMachine.setState(gumballMachine.getSoldState());
		//dispense is moved to the gumball machine, we just handle state transitions here.
		//gumballMachine.getSoldState().dispense();
		
		int winner = randomNumber.nextInt(10);
		if ( (winner == 0) && (gumballMachine.getCount() > 1)) {
			gumballMachine.setState(gumballMachine.getWinnerState());
		} else {
			gumballMachine.setState(gumballMachine.getSoldState());
		}
	}
	
	@Override
	public void dispense() {
		System.out.println("No gumball dispensed");
	}

}
