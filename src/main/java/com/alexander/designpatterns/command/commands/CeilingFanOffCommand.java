package com.alexander.designpatterns.command.commands;

import com.alexander.designpatterns.command.Command;
import com.alexander.designpatterns.command.vendorclasses.CeilingFan;

public class CeilingFanOffCommand extends CeilingFanCommand implements Command {
	
	public CeilingFanOffCommand(CeilingFan ceilingFan){
		super(ceilingFan);
	}
	
	@Override
	public void execute() {
		this.prevSpeed = this.ceilingFan.getSpeed();
		this.ceilingFan.off();
	}
}
