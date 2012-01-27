package com.alexander.designpatterns.proxy.rmi;

import java.io.File;
import java.rmi.Naming;

public class GumballMonitorTestDrive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.setProperty("java.security.policy","src/main/java/com/alexander/designpatterns/proxy/rmi/client.policy");
		if (System.getSecurityManager() == null){
			System.setSecurityManager(new SecurityManager());
		}
		//create gumball machines here and register them with the rmi registry
		
		String[] locations = {"127.0.0.1/gumballmachine","127.0.0.1/gumballmachine","127.0.0.1/gumballmachine"};
		try{
			//get stub and call methods
			for (int i = 0; i < locations.length; i ++){
				GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup("rmi://"+locations[i]+""+i);
				GumballMonitor monitor = new GumballMonitor(machine);
				System.out.println(monitor);
				monitor.report();
			}
		} catch (Exception e){
			e.printStackTrace();
		}
	}
}
