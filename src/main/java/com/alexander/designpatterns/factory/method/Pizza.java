package com.alexander.designpatterns.factory.method;

import java.util.ArrayList;

import org.apache.log4j.Logger;

public abstract class Pizza {

	protected Logger log = Logger.getLogger(Pizza.class.getName());
	
	protected String name;
	protected String dough;
	protected String sauce;
	protected ArrayList<String> toppings = new ArrayList<String>();
	
	public Pizza(){
		
	}
	
	public void prepare(){
		log.info("Preparing " + name);
		log.info("Tossing dough...");
		log.info("Adding sauce...");
		log.info("Adding toppings...");
		for (int i = 0; i < toppings.size(); i++){
			log.info("  " + toppings.get(i));
		}
	}
	
	public void bake(){
		log.info("Bake for 25 minutes at 350");
	}
	
	public void cut(){
		log.info("Cutting the pizza into diagonal slices");
	}
	
	public void box(){
		log.info("Place pizza in official PizzaStore box");
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
}
