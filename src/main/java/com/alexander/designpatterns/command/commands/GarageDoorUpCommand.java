package com.alexander.designpatterns.command.commands;

import com.alexander.designpatterns.command.Command;
import com.alexander.designpatterns.command.vendorclasses.GarageDoor;

public class GarageDoorUpCommand implements Command {

	private GarageDoor garageDoor;
	
	public GarageDoorUpCommand(GarageDoor garageDoor){
		this.garageDoor = garageDoor;
	}
	
	@Override
	public void execute() {
		this.garageDoor.up();
	}

	@Override
	public void undo() {
		this.garageDoor.down();
	}

}
