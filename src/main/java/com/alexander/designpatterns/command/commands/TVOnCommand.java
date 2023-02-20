package com.alexander.designpatterns.command.commands;

import com.alexander.designpatterns.command.Command;
import com.alexander.designpatterns.command.vendorclasses.TV;

public class TVOnCommand implements Command {

	private TV tv;
	
	public TVOnCommand(TV tv){
		this.tv = tv;
	}
	
	@Override
	public void execute() {
		this.tv.on();
	}

	@Override
	public void undo() {
		this.tv.off();
	}

}
