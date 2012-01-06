package com.alexander.designpatterns.command.commands;

import com.alexander.designpatterns.command.Command;
import com.alexander.designpatterns.command.vendorclasses.GarageDoor;

public class GarageDoorOpenCommand implements Command {

	private GarageDoor door;
	
	public GarageDoorOpenCommand(GarageDoor door){
		this.door = door;
	}
	
	@Override
	public void execute() {
		this.door.up();
		this.door.lightOn();
	}

	@Override
	public void undo() {
		this.door.down();
		this.door.lightOff();
	}

}
