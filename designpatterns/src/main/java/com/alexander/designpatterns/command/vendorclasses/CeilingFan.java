package com.alexander.designpatterns.command.vendorclasses;

public class CeilingFan {

	private String name;
	public static final int HIGH = 3;
	public static final int MEDIUM = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;
	private int speed;
	
	public CeilingFan(String name){
		this.name = name;
	}
	
	public void high(){
		System.out.println(name+" ceiling fan is on high");
		speed = HIGH;
	}
	
	public void medium(){
		System.out.println(name+" ceiling fan is on medium");
		speed = MEDIUM;
	}
	
	public void low(){
		System.out.println(name+" ceiling fan is on low");
		speed = LOW;
	}
	
	public void off(){
		System.out.println(name+" ceiling fan is off");
		speed = OFF;
	}

	public void on(){
		System.out.println(name+" ceiling fan is on");
	}
	
	public int getSpeed(){
//		System.out.println(name+" ceiling fan speed is "+speed);
		return speed;
	}
}
