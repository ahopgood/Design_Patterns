package com.alexander.designpatterns.proxy.rmi;

public class SoldOutState implements State {

	private static final long serialVersionUID = -7799761472955058253L;
	private transient GumballMachine gumballMachine;
	
	public SoldOutState(GumballMachine gumballMachine){
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("You can't insert a quarter, the machine is sold out");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("You can't eject, you haven't inserted a quarter yet");
	}
	
	@Override
	public void turnCrank() {
		System.out.println("You turned but there are no gumballs left");
	}
	
	@Override
	public void dispense() {
		System.out.println("No gumball dispensed");
	}

}
