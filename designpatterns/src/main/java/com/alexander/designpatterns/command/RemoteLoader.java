package com.alexander.designpatterns.command;

import com.alexander.designpatterns.command.commands.CeilingFanHighCommand;
import com.alexander.designpatterns.command.commands.CeilingFanMediumCommand;
import com.alexander.designpatterns.command.commands.CeilingFanOffCommand;
import com.alexander.designpatterns.command.commands.CeilingFanOnCommand;
import com.alexander.designpatterns.command.commands.HottubOffCommand;
import com.alexander.designpatterns.command.commands.HottubOnCommand;
import com.alexander.designpatterns.command.commands.LightOffCommand;
import com.alexander.designpatterns.command.commands.LightOnCommand;
import com.alexander.designpatterns.command.commands.MacroCommand;
import com.alexander.designpatterns.command.commands.StereoOffCommand;
import com.alexander.designpatterns.command.commands.StereoOnCommand;
import com.alexander.designpatterns.command.commands.StereoOnWithCDCommand;
import com.alexander.designpatterns.command.commands.TVOffCommand;
import com.alexander.designpatterns.command.commands.TVOnCommand;
import com.alexander.designpatterns.command.vendorclasses.CeilingFan;
import com.alexander.designpatterns.command.vendorclasses.Hottub;
import com.alexander.designpatterns.command.vendorclasses.Light;
import com.alexander.designpatterns.command.vendorclasses.Stereo;
import com.alexander.designpatterns.command.vendorclasses.TV;

public class RemoteLoader {

	public static void main(String[] args){
		RemoteLoader loader = new RemoteLoader();
//		loader.onOff();
//		loader.basicUndo();
//		loader.ceilingFanUndo();
		loader.macroCommands();
	}
	
	public void onOff(){
		RemoteControl remoteControl = new RemoteControl();
		Light kitchenLight = new Light("Kitchen");
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		Stereo stereo = new Stereo("Living Room");
		
		LightOnCommand kitchenLightOn = 
				new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = 
				new LightOffCommand(kitchenLight);
		
		CeilingFanOnCommand ceilingFanOn = 
				new CeilingFanOnCommand(ceilingFan);
		
		CeilingFanOffCommand ceilingFanOff =
				new CeilingFanOffCommand(ceilingFan);
		
		StereoOnWithCDCommand stereoOnWithCD = 
				new StereoOnWithCDCommand(stereo);
		StereoOffCommand stereoOff = 
				new StereoOffCommand(stereo);
		
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
		remoteControl.setCommand(3, stereoOnWithCD, stereoOff);
		
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPushed(2);
		remoteControl.onButtonWasPushed(3);
		remoteControl.offButtonWasPushed(3);
	}
	
	public void basicUndo(){
		RemoteControl remoteControl = new RemoteControl();
		
		Light livingRoomLight = new Light("Living Room");
		LightOnCommand livingRoomLightOn = 
				new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = 
				new LightOffCommand(livingRoomLight);
		
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		
		System.out.println(remoteControl);
		
		remoteControl.undoButtonWasPushed();
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(0);
		
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();
	}
	
	public void ceilingFanUndo(){
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		
//		CeilingFanOnCommand ceilingFanOn = 
//				new CeilingFanOnCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff =
				new CeilingFanOffCommand(ceilingFan);
		CeilingFanHighCommand ceilingFanHigh = 
				new CeilingFanHighCommand(ceilingFan);
		CeilingFanMediumCommand ceilingFanMedium =
				new CeilingFanMediumCommand(ceilingFan);
		
		RemoteControl remote = new RemoteControl();
		
		remote.setCommand(0, ceilingFanMedium, ceilingFanOff);
		remote.setCommand(1, ceilingFanHigh, ceilingFanOff);
		
		remote.onButtonWasPushed(0);
		remote.offButtonWasPushed(0);
		System.out.println(remote);
		remote.undoButtonWasPushed();
		
		remote.onButtonWasPushed(1);
		System.out.println(remote);
		remote.undoButtonWasPushed();
	}
	
	public void macroCommands(){
		RemoteControl remote = new RemoteControl();
		
		Light light = new Light("Living Room");
		TV tv = new TV("Living Room");
		Stereo stereo = new Stereo("Living Room");
		Hottub hottub = new Hottub();
		
		LightOnCommand lightOn = new LightOnCommand(light);
		StereoOnCommand stereoOn = new StereoOnCommand(stereo);
		TVOnCommand tvOn = new TVOnCommand(tv);
		HottubOnCommand hottubOn = new HottubOnCommand(hottub);
		Command[] partyOn = {lightOn, stereoOn, tvOn, hottubOn};
		
		LightOffCommand lightOff = new LightOffCommand(light);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);
		TVOffCommand tvOff = new TVOffCommand(tv);
		HottubOffCommand hottubOff = new HottubOffCommand(hottub);
		Command[] partyOff = {lightOff, stereoOff, tvOff, hottubOff};
		
		MacroCommand partyOnMacro = new MacroCommand(partyOn);
		MacroCommand partyOffMacro = new MacroCommand(partyOff);
		
		remote.setCommand(0, partyOnMacro, partyOffMacro);
		
		System.out.println(remote);
		System.out.println("--- Pushing Macro On");
		remote.onButtonWasPushed(0);
		
		System.out.println("--- Pushing Macro Off ---");
		remote.offButtonWasPushed(0);
	}
}
