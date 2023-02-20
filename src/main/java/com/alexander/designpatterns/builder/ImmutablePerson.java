package com.alexander.designpatterns.builder;

public class ImmutablePerson {

	private final String 	forename;
	private final String 	surname;
	private final int 		weight;
	private final float 	height;
	private final boolean 	beard;
	
	public ImmutablePerson(final String forename, final String surname,
			final int weight, final float height, final boolean beard){
		this.forename 	= forename;
		this.surname 	= surname;
		this.weight 	= weight;
		this.height		= height;
		this.beard		= beard;
	}
	
	public String getForename(){
		return this.forename;
	}
	
	public String getSurname(){
		return this.surname;
	}
	
	public int getWeight(){
		return this.weight;
	}
	
	public float getHeight(){
		return this.height;
	}
	
	public boolean hasBeard(){
		return this.beard;
	}
}
