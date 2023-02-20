package com.alexander.designpatterns.template.hook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageHook {

	@Override
	void hook() {
		System.out.println("Adding Sugar and Milk");
	}

	@Override
	void brew() {
		System.out.println("Dripping Coffee through filter");
	}
	
	//overrides suoer class method to decide if we should use the hook
	@Override
	public boolean customerWantsCondiments(){
		String answer = getUserInput();
		if (answer.toLowerCase().startsWith("y")){
			return true;
		} else {
			return false;
		}
	}
	
	public String getUserInput(){
		String answer = null;
		System.out.println("Would you like milk and sugar with your coffee (y/n)?");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try{
			answer = in.readLine();
		} catch (IOException ioe){
			System.err.println("IO error trying to read your answer");
		}
		if (answer == null){
			return "no";
		}
		return answer;
	}

}
