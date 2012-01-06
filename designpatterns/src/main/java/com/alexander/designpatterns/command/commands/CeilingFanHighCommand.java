package com.alexander.designpatterns.command.commands;

import com.alexander.designpatterns.command.Command;
import com.alexander.designpatterns.command.vendorclasses.CeilingFan;

public class CeilingFanHighCommand extends CeilingFanCommand implements Command {
	
	public CeilingFanHighCommand(CeilingFan ceilingFan){
		super(ceilingFan);
	}
	
	@Override
	public void execute() {
		this.prevSpeed = ceilingFan.getSpeed();
		this.ceilingFan.high();
	}
}
