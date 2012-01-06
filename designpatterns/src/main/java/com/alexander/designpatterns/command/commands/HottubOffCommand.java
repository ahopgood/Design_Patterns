package com.alexander.designpatterns.command.commands;

import com.alexander.designpatterns.command.Command;
import com.alexander.designpatterns.command.vendorclasses.Hottub;

public class HottubOffCommand implements Command {

	private Hottub hottub;
	
	public HottubOffCommand(Hottub hottub){
		this.hottub = hottub;
	}
	
	@Override
	public void execute() {
		this.hottub.jetsOff();
	}

	@Override
	public void undo() {
		this.hottub.jetsOn();
		this.hottub.circulate();
	}

}
