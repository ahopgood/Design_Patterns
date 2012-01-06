package com.alexander.designpatterns.command.logging;

import com.alexander.designpatterns.command.Command;

public interface LoggingCommand extends Command {

	//use serialization to store and load a command object.
	public void store();
	public void load();
}
