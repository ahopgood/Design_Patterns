package com.alexander.designpatterns.command.commands;

import com.alexander.designpatterns.command.Command;
import com.alexander.designpatterns.command.vendorclasses.Hottub;

public class HottubOnCommand implements Command {

	private Hottub hottub;
	
	public HottubOnCommand(Hottub hottub){
		this.hottub = hottub;
	}
	
	@Override
	public void execute() {
		hottub.jetsOn();
		hottub.circulate();
	}

	@Override
	public void undo() {
		hottub.jetsOff();
	}

}
