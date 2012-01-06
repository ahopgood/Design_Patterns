package com.alexander.designpatterns.command.vendorclasses;

public class Hottub {
	
	private int temp;
	
	public void circulate(){
		System.out.println("Hottub is bubbling");
	}
	
	public void jetsOn(){
		System.out.println("Hottub is heating to a steaming 104 degrees");
	}
	
	public void jetsOff(){
		System.out.println("Hottub is cooling to 98 degrees");
	}
	
	public void setTemperature(int temp){
		this.temp = temp;
	}
}
