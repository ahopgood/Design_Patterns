package com.alexander.designpatterns.proxy.rmi;

import java.rmi.RemoteException;

public class GumballMonitor {

	private GumballMachineRemote gumballMachine;
	
	public GumballMonitor(GumballMachineRemote gumballMachine) throws RemoteException{
		this.gumballMachine = gumballMachine;
	}
	
	public void report(){
		try {
			System.out.println("Gumball Machine: " + gumballMachine.getLocation());
			System.out.println("Current Inventory " + gumballMachine.getCount());
			System.out.println("Current State " + gumballMachine.getState());
		} catch (RemoteException re){
			re.printStackTrace();
		}
	}
}
