package com.alexander.designpatterns.proxy.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GumballMachineRemote extends Remote {

	public int getCount() throws RemoteException;
	public String getLocation() throws RemoteException;
	//make state serializable as it will be passed as a return value through RMI
	public State getState() throws RemoteException;
}
