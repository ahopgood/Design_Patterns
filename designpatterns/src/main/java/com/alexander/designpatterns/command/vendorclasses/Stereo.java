package com.alexander.designpatterns.command.vendorclasses;

public class Stereo {
	
	private String name;
	private int vol;
	
	public Stereo (String name){
		this.name = name;
	}

	public void on(){
		System.out.println(name+" stereo is on");
	}
	
	public void off(){
		System.out.println(name+" stereo is off");
	}
	
	public void setCd(){
		System.out.println(name+" stereo is set for CD input");
	}
	
	public void setDvd(){
		System.out.println(name+" stereo is set for DVD input");
	}
	
	public void setRadio(){
		System.out.println(name+" stereo is set for Radio input");		
	}
	
	public void setVolume(int vol){
		this.vol = vol;
		System.out.println(name+" stereo volume is set to "+this.vol);
	}
}
