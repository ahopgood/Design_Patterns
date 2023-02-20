package com.alexander.designpatterns.template.sorting;

public class Duck implements Comparable<Duck> {

	private String name;
	private int weight;
	
	public Duck(String name, int weight){
		this.name = name;
		this.weight = weight;
	}
	
	public String toString(){
		return name + " weighs " + weight;
	}
	
	@Override
	public int compareTo(Duck duck) {
		if (this.weight < duck.weight){
			return -1;
		} else if (this.weight == duck.weight){
			return 0;
		} else if (this.weight > duck.weight){
			return 1;
		}
		return 0;
	}
}
