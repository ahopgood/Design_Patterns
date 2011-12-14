package com.alexander.designpatterns.observer;

import java.util.LinkedList;
import java.util.List;

import com.alexander.designpatterns.observer.interfaces.Observer;
import com.alexander.designpatterns.observer.interfaces.Subject;

public class WeatherData implements Subject {

	private List<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData(){
		observers = new LinkedList<Observer>();
	}
	
	public void registerObserver(Observer o) {
		observers.add(o);

	}

	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	public void notifyObservers() {
		for (Observer observer : observers){
			observer.update(temperature, humidity, pressure);
		}
	}
	
	public void measurementsChanged(){
		notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure){
		this.temperature 	= temperature;
		this.humidity 		= humidity;
		this.pressure 		= pressure;
		
		measurementsChanged();
	}

}
