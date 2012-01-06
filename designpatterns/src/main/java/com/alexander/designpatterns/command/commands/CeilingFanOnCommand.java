package com.alexander.designpatterns.command.commands;

import com.alexander.designpatterns.command.Command;
import com.alexander.designpatterns.command.vendorclasses.CeilingFan;

public class CeilingFanOnCommand implements Command {

	private CeilingFan ceilingFan;
	
	public CeilingFanOnCommand(CeilingFan ceilingFan){
		this.ceilingFan = ceilingFan;
	}
	
	@Override
	public void execute() {
		this.ceilingFan.on();
	}

	@Override
	public void undo() {
		this.ceilingFan.off();
	}

}
