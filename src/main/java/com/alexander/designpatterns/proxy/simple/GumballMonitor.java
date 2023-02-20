package com.alexander.designpatterns.proxy.simple;

public class GumballMonitor {

	private GumballMachine gumballMachine;
	
	public GumballMonitor(GumballMachine gumballMachine){
		this.gumballMachine = gumballMachine;
	}
	
	public void report(){
		System.out.println("Gumball Machine: " + gumballMachine.getLocation());
		System.out.println("Current Inventory " + gumballMachine.getCount());
		System.out.println("Current State " + gumballMachine.getState());
	}
}
