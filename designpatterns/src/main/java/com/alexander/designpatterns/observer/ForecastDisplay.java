package com.alexander.designpatterns.observer;

import org.apache.log4j.Logger;

import com.alexander.designpatterns.observer.interfaces.Observer;

public class ForecastDisplay implements DisplayElement, Observer {

	private WeatherData weatherData;
	private float currentPressure = 29.2f;
	private float lastPressure;
	private Logger logger = Logger.getLogger(ForecastDisplay.class);
	
	public ForecastDisplay(WeatherData weatherData){
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}
	
	public void update(float temp, float humidity, float pressure) {
		lastPressure = currentPressure;
		currentPressure = pressure;
		
		display();
	}

	public void display() {
		logger.info("Forecast: ");
		if (currentPressure > lastPressure){
			logger.info("Improving weather on the way!");
		} else if (currentPressure == lastPressure){
			logger.info("More of the same");
		} else if (currentPressure < lastPressure){
			logger.info("Watch out for cooler, rainy weather");
		}
	}

}
