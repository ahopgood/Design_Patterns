package com.alexander.designpatterns.command.commands;

import com.alexander.designpatterns.command.Command;
import com.alexander.designpatterns.command.vendorclasses.CeilingFan;

public abstract class CeilingFanCommand implements Command {

	protected CeilingFan ceilingFan;
	protected int prevSpeed;
	
	protected CeilingFanCommand(CeilingFan ceilingFan){
		this.ceilingFan = ceilingFan;
	}
	
	public abstract void execute();

	public void undo(){
		if (this.prevSpeed == CeilingFan.HIGH){
			ceilingFan.high();
		} else if (this.prevSpeed == CeilingFan.MEDIUM){
			ceilingFan.medium();
		} else if (this.prevSpeed == CeilingFan.LOW){
			ceilingFan.low();
		} else if (this.prevSpeed == CeilingFan.OFF){
			ceilingFan.off();
		}
	}
}
