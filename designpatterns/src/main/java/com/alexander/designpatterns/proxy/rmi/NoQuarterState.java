package com.alexander.designpatterns.proxy.rmi;

public class NoQuarterState implements State {

	private static final long serialVersionUID = 3290311106141180738L;
	private transient GumballMachine gumballMachine;
	
	public NoQuarterState(GumballMachine gumballMachine){
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("You inserted a quarter");
		//transition to the HasQuarterState
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {
		System.out.println("You haven't inserted a quarter");
	}
	
	@Override
	public void turnCrank() {
		System.out.println("You turned but there's no quarter");
	}
	
	@Override
	public void dispense() {
		System.out.println("You need to pay first");
	}

}
