package com.alexander.designpatterns.observer;

import org.apache.log4j.Logger;

import com.alexander.designpatterns.observer.interfaces.Observer;
import com.alexander.designpatterns.observer.interfaces.Subject;

public class CurrentConditionDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	private Logger logger = Logger.getLogger(CurrentConditionDisplay.class);
	
	public CurrentConditionDisplay(Subject weatherData){
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}
	
	
	public void display() {
		logger.info("Current conditions: " + temperature + "F degrees and " + 
			humidity + "% humidity");

	}



	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		display();
	}


}
