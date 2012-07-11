package com.alexander.designpatterns.compound.mvc;

public class DJTestDrive {

	public void Main(String[] args){
		BeatModelInterface model 		= new BeatModel();
		ControllerInterface controller 	= new BeatController(model);
	}
}
