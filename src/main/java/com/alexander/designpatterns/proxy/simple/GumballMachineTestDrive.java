package com.alexander.designpatterns.proxy.simple;

public class GumballMachineTestDrive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int count = 0;
		if (args.length < 2){
			System.out.println("GumballMachine <name> <Inventory>");
			System.exit(1);
		}
		
		count = Integer.parseInt(args[1]);
		GumballMachine gumballMachine = new GumballMachine(args[0],count);
		
		GumballMonitor monitor = new GumballMonitor(gumballMachine);
		monitor.report();
		
		System.out.println(gumballMachine);
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		
		System.out.println(gumballMachine);
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		
		System.out.println(gumballMachine);
	}

}
