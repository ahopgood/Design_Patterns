package com.alexander.designpatterns.observer;

import org.apache.log4j.BasicConfigurator;

public class WeatherStation {

	public WeatherStation(){
		
	}
	
	public static void main(String[] args){
		BasicConfigurator.configure();
		
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionDisplay currentDisplay = 
				new CurrentConditionDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = 
				new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = 
				new ForecastDisplay(weatherData);
		
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
		
		
	}
	
}
