package com.alexander.designpatterns.builder;

public class PersonClass {
	
	private String 	forename;
	private String 	surname;
	private int 	weight;
	private float 	height;
	private boolean beard;
	
	public PersonClass(){	}

	public String getForename() {
		return forename;
	}

	public void setForename(String forename) {
		this.forename = forename;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public boolean isBeard() {
		return beard;
	}

	public void setBeard(boolean beard) {
		this.beard = beard;
	}
}
