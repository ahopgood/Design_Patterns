package com.alexander.designpatterns.command.commands;

import com.alexander.designpatterns.command.Command;
import com.alexander.designpatterns.command.vendorclasses.CeilingFan;

public class CeilingFanMediumCommand extends CeilingFanCommand implements Command {
	
	public CeilingFanMediumCommand(CeilingFan ceilingFan){
		super(ceilingFan);
	}
	
	@Override
	public void execute() {
		this.prevSpeed = this.ceilingFan.getSpeed();
		this.ceilingFan.medium();
	}

}
