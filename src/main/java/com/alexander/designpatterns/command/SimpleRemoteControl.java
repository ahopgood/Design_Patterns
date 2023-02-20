package com.alexander.designpatterns.command;

public class SimpleRemoteControl {

	private Command slot;
	
	public SimpleRemoteControl(){ }
	
	public void setCommand(Command command){
		slot = command;
	}
	
	public void buttonWasPressed(){
		slot.execute();
	}
}
