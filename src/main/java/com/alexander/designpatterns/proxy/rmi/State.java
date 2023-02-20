package com.alexander.designpatterns.proxy.rmi;

import java.io.Serializable;

public interface State extends Serializable{
	//Each state references a gumball machine
	//make this transient so that we don't attempt to transport the gumball machine as well as the state using serializable.
	
	public void insertQuarter();
	public void ejectQuarter();
	public void dispense();
	public void turnCrank();
}
