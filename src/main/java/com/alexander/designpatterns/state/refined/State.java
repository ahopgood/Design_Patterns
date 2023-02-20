package com.alexander.designpatterns.state.refined;

public interface State {
	
	public void insertQuarter();
	public void ejectQuarter();
	public void dispense();
	public void turnCrank();
}
