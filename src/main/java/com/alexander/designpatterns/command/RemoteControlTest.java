package com.alexander.designpatterns.command;

import com.alexander.designpatterns.command.commands.GarageDoorOpenCommand;
import com.alexander.designpatterns.command.commands.LightOnCommand;
import com.alexander.designpatterns.command.vendorclasses.GarageDoor;
import com.alexander.designpatterns.command.vendorclasses.Light;

public class RemoteControlTest {

	public static void main(String[] args){
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light("Light");
		LightOnCommand lightOn = new LightOnCommand(light);
		
		GarageDoor garage = new GarageDoor("");
		GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garage);
		
		remote.setCommand(lightOn);
		remote.buttonWasPressed();
		
		remote.setCommand(garageOpen);
		remote.buttonWasPressed();
	}
}
