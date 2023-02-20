package com.alexander.rmi.simple;

import java.io.Serializable;

public class ComplexObject implements Serializable{

	private static final long serialVersionUID = -2999333058515842595L;
	private String name;
	private int lives;
	
	public ComplexObject(String name, int lives){
		this.name = name;
		this.lives = lives;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLives() {
		return lives;
	}

	public void setLives(int lives) {
		this.lives = lives;
	}
	
}
