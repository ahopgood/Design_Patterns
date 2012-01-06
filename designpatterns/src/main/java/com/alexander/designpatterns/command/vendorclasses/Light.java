package com.alexander.designpatterns.command.vendorclasses;

public class Light {

	private String name;
	
	public Light(String name){
		this.name = name;
	}
	
	public void on(){
		System.out.println(name+" light is On");
	}
	
	public void off(){
		System.out.println(name+" light is Off");
	}
}
