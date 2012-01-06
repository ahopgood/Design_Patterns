package com.alexander.designpatterns.command.vendorclasses;

public class TV {

	private String location;
	private int channel;
	private int volume;
	
	public TV(String location){
		this.location = location;
	}
	
	public void on(){
		System.out.println(location + " tv is on");
	}
	
	public void off(){
		System.out.println(location + " tv is off");
	}
	
	public void setInputChannel(){
		System.out.println(location + " tv channel set for DVD");
	}
	
	public void setVolume(){
		System.out.println(location + " tv volume set to " + volume);
	}
}
