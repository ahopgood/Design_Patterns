package com.alexander.designpatterns.observer;

import org.apache.log4j.Logger;

import com.alexander.designpatterns.observer.interfaces.Observer;

public class StatisticsDisplay implements DisplayElement, Observer {

	private WeatherData weatherData;
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum = 0.0f;
	private int numReadings;
	
	private Logger logger = Logger.getLogger(StatisticsDisplay.class);
	
	public StatisticsDisplay(WeatherData weatherData){
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}
	
	public void update(float temp, float humidity, float pressure) {
		tempSum += temp;
		numReadings++;
		
		if (temp > maxTemp){
			maxTemp = temp;
		}
		
		if (temp < minTemp){
			minTemp = temp;
		}
		
		display();
	}

	public void display() {
		logger.info("Avg/Max/Min temperature = " + (tempSum / numReadings)
				+ "/" + maxTemp + "/" + minTemp);
	}
}
