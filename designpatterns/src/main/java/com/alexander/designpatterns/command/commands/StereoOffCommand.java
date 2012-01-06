package com.alexander.designpatterns.command.commands;

import com.alexander.designpatterns.command.Command;
import com.alexander.designpatterns.command.vendorclasses.Stereo;

public class StereoOffCommand implements Command {

	private Stereo stereo;
	
	public StereoOffCommand(Stereo stereo){
		this.stereo = stereo;
	}
	
	@Override
	public void execute() {
		this.stereo.off();
	}

	@Override
	public void undo() {
		this.stereo.on();
	}

}
