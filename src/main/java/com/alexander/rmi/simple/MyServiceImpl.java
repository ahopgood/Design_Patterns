package com.alexander.rmi.simple;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class MyServiceImpl extends UnicastRemoteObject implements MyService {
	
	private static final long serialVersionUID = 8051859967622980176L;
	private int primitive;
	private ComplexObject complex;
	
	public MyServiceImpl() throws RemoteException{
		
	}
	
	@Override
	public void setPrimitive(int value) throws RemoteException {
		this.primitive = value;
	}

	@Override
	public int getPrimitive() throws RemoteException {
		return this.primitive;
	}

	@Override
	public void setObject(ComplexObject object) throws RemoteException {
		this.complex = object;
	}

	@Override
	public ComplexObject getObject() throws RemoteException {
		return this.complex;
	}

}
