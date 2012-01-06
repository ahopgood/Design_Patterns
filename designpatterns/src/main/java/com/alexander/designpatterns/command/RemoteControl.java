package com.alexander.designpatterns.command;

import com.alexander.designpatterns.command.commands.NoCommand;

public class RemoteControl {

	private Command[] onCommands;
	private Command[] offCommands;
	private Command undo;
	
	public RemoteControl(){
		onCommands = new Command[7];
		offCommands = new Command[7];
		
		Command noCommand = new NoCommand();
		for (int i = 0; i < 7; i++){
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		undo = noCommand;
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand){
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	public void onButtonWasPushed(int slot){
		onCommands[slot].execute();
		undo = onCommands[slot];
	}
	
	public void offButtonWasPushed(int slot){
		offCommands[slot].execute();
		undo = offCommands[slot];
	}
	
	public void undoButtonWasPushed(){
		undo.undo();
	}
	
	public String toString(){
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n------ Remote Control ------\n");
		for (int i = 0; i < 7; i++){
			stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName() +
					"\t\t" + offCommands[i].getClass().getName() + "\n");
		}
		stringBuff.append("[undo] " + undo.getClass().getName() + "\n");
		
		return stringBuff.toString();
	}
}
