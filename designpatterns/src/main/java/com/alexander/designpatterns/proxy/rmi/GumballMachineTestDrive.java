package com.alexander.designpatterns.proxy.rmi;

import java.rmi.Naming;
import java.rmi.RemoteException;

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
		
		try {
			
			//Monitor test drive
			System.setProperty("java.security.policy", "src/main/java/com/alexander/designpatterns/proxy/rmi/server.policy");
			System.setProperty("java.rmi.server.codebase", GumballMachine.class.getProtectionDomain().getCodeSource().getLocation().toString());
			if (System.getSecurityManager() == null){
				System.setSecurityManager(new SecurityManager());
			}
			
			String[] locations = {"127.0.0.1","127.0.0.1","127.0.0.1"};
			int[] balls = {5,2,6};
			
			for (int i = 0; i < locations.length; i++){
				GumballMachine gumballMachine = new GumballMachine(locations[i],balls[i]);		
				Naming.rebind("//" + locations[i] + "/gumballmachine"+i, gumballMachine);
			}

			System.out.println("Have bound the stubs");

			

			
//			GumballMonitor monitor = new GumballMonitor(gumballMachine);
//			monitor.report();
//			System.out.println("Report finished");
			
//			System.out.println(gumballMachine);
//			gumballMachine.insertQuarter();
//			gumballMachine.turnCrank();
//			
//			System.out.println(gumballMachine);
//			
//			gumballMachine.insertQuarter();
//			gumballMachine.turnCrank();
//			gumballMachine.insertQuarter();
//			gumballMachine.turnCrank();
//			
//			System.out.println(gumballMachine);

		} catch (Exception e){
			System.out.println(e.getLocalizedMessage());
			e.printStackTrace();
		}
	}
}
