package org.andradev;

import org.andradev.displays.CurrentConditionsDisplay;
import org.andradev.displays.ForecastDisplay;
import org.andradev.displays.StatisticsDisplay;

public class Main {
	public static void main(String[] args) {
		
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay ccDisplay =
			new CurrentConditionsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		
		weatherData.setMeasurements(80f, 65f, 30.4f);
		System.out.println("---------------------------");
		weatherData.setMeasurements(82f, 70f, 27f);
		System.out.println("---------------------------");
		weatherData.setMeasurements(78f, 90f, 29.92f);
	}
}