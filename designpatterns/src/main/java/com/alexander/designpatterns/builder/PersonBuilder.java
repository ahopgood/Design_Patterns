package com.alexander.designpatterns.builder;

public class PersonBuilder {
	
	private String 	forename	= "";
	private String 	surname		= "";
	private int 	weight		= 0;
	private float 	height		= 0.0f;
	private boolean beard		= false;
	
	public static PersonBuilder getBuilder(){
		return new PersonBuilder();
	}
	
	public PersonClass build(){
		PersonClass person = new PersonClass();
		person.setForename(this.forename);
		person.setSurname(this.surname);
		person.setHeight(this.height);
		person.setWeight(this.weight);
		person.setBeard(beard);
		return person;
	}

	public PersonBuilder withForename(String forename) {
		this.forename = forename;
		return this;
	}

	public PersonBuilder withSurname(String surname) {
		this.surname = surname;
		return this;
	}

	public PersonBuilder withWeight(int weight) {
		this.weight = weight;
		return this;
	}

	public PersonBuilder withHeight(float height) {
		this.height = height;
		return this;
	}

	public PersonBuilder withBeard(boolean beard) {
		this.beard = beard;
		return this;
	}
}
