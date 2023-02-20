package com.alexander.designpatterns.state.refined;

public class GumballMachine {

	private NoQuarterState noQuarterState;
	private HasQuarterState hasQuarterState;
	private SoldState soldState;
	private SoldOutState soldOutState;
	private WinnerState winnerState;
	
	private State state = soldOutState;
	
	private int count = 0;
	
	public GumballMachine(int numberGumballs){
		this.count = numberGumballs;
		
		soldOutState	= new SoldOutState(this);
		noQuarterState 	= new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState 		= new SoldState(this);
		winnerState		= new WinnerState(this);
		
		if (numberGumballs > 0){
			state = noQuarterState;
		}
	}
	
	public void insertQuarter(){
		state.insertQuarter();
	}
	
	public void ejectQuarter(){
		state.ejectQuarter();
	}
	
	public void turnCrank(){
		state.turnCrank();
		state.dispense();
	}
	
	public void releaseBall(){
		System.out.println("A gumball comes rolling out of the slot ....");
		if (count != 0){
			count = count - 1;
		}
	}
	
	//no need for a dispense method since this is never to be called by the user of the gumball machine.
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public NoQuarterState getNoQuarterState() {
		return noQuarterState;
	}
	public void setNoQuarterState(NoQuarterState noQuarterState) {
		this.noQuarterState = noQuarterState;
	}
	public HasQuarterState getHasQuarterState() {
		return hasQuarterState;
	}
	public void setHasQuarterState(HasQuarterState hasQuarterState) {
		this.hasQuarterState = hasQuarterState;
	}
	public SoldState getSoldState() {
		return soldState;
	}
	public void setSoldState(SoldState soldState) {
		this.soldState = soldState;
	}
	public SoldOutState getSoldOutState() {
		return soldOutState;
	}
	public void setSoldOutState(SoldOutState soldOutState) {
		this.soldOutState = soldOutState;
	}
	public WinnerState getWinnerState() {
		return winnerState;
	}
	public void setWinnerState(WinnerState winnerState) {
		this.winnerState = winnerState;
	}

	public String toString(){
		String status = "";
		if (state instanceof NoQuarterState){
			status = "waiting for quarter";
		} else if (state instanceof SoldOutState){
			status = "sold out";
		} else if (state instanceof HasQuarterState){
			status = "";
		} else if (state instanceof SoldState){
			status = "";
		} else if (state instanceof WinnerState){
			status = "";
		}
		return "\nMighty Gumball, Inc.\nJava-enabled Standing Gumball Model #2012\nInventory: "+count+" gumballs\nMachine is "+status+".\n";
	}
}
