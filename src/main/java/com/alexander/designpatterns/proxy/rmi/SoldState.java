package com.alexander.designpatterns.proxy.rmi;

public class SoldState implements State {

	private static final long serialVersionUID = -2190095305956851158L;
	private transient GumballMachine gumballMachine;
	
	public SoldState(GumballMachine gumballMachine){
		this.gumballMachine = gumballMachine; 
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("Please wait, we're already giving you a gumball");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Sorry, you already turned the crank");
	}
	
	@Override
	public void turnCrank() {
		System.out.println("Turning twice doesn't get you another gumball");
	}
	
	@Override
	public void dispense() {
		//count modification is done in the gumball machine, only state transitions happen here.
//		System.out.println("A gumball comes rolling out the slot");
//		count = count - 1;
		gumballMachine.releaseBall();	//changes the count
		int count = gumballMachine.getCount();
		if (count > 0){
//			state = NO_QUARTER;
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		} else {
			System.out.println("Ooops, out of gumballs!");
			gumballMachine.setState(gumballMachine.getSoldOutState());
//			state = SOLD_OUT;
		}
	}

}
