package com.alexander.designpatterns.builder;

public class ImmutablePersonBuilder {

	private String 	forename	= "";
	private String 	surname		= "";
	private int 	weight		= 0;
	private float 	height		= 0.0f;
	private boolean beard		= false;
	
	public static ImmutablePersonBuilder getBuilder(){
		return new ImmutablePersonBuilder();
	}
	
	public ImmutablePerson build(){
		ImmutablePerson person = new ImmutablePerson(this.forename,
				this.surname, this.weight, this.height, this.beard);
		return person;
	}

	public ImmutablePersonBuilder withForename(String forename) {
		this.forename = forename;
		return this;
	}

	public ImmutablePersonBuilder withSurname(String surname) {
		this.surname = surname;
		return this;
	}

	public ImmutablePersonBuilder withWeight(int weight) {
		this.weight = weight;
		return this;
	}

	public ImmutablePersonBuilder withHeight(float height) {
		this.height = height;
		return this;
	}

	public ImmutablePersonBuilder withBeard(boolean beard) {
		this.beard = beard;
		return this;
	}
}
