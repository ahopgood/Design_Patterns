package com.alexander.rmi.simple;

import java.rmi.Remote;
import java.rmi.RemoteException;


public interface MyService extends Remote {
	
	public void setPrimitive(int value) throws RemoteException;
	public int getPrimitive() throws RemoteException;
	public void setObject(ComplexObject object) throws RemoteException;
	public ComplexObject getObject() throws RemoteException;
}
