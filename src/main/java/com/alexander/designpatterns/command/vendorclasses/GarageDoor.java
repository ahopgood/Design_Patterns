package com.alexander.designpatterns.command.vendorclasses;

public class GarageDoor {
	
	private String name;
	
	public GarageDoor(String name){
		this.name = name;
	}

	public void up(){
		System.out.println("garage door is up");
	}
	
	public void down(){
		System.out.println("garage door is down");
	}
	
	public void stop(){
		System.out.println("garage door ");
	}
	
	public void lightOn(){
		System.out.println("garage door light is on");
	}
	
	public void lightOff(){
		System.out.println("garage door light is off");
	}
}
