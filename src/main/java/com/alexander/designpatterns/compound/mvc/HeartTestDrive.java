package com.alexander.designpatterns.compound.mvc;

public class HeartTestDrive {

	public static void main (String[] args){
		HeartModel heartModel = new HeartModel();
		ControllerInterface model = new HeartController(heartModel);
	}
	
}
