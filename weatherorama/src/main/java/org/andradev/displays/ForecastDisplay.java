package org.andradev.displays;

import org.andradev.DisplayElement;
import org.andradev.Observer;
import org.andradev.WeatherData;

public class ForecastDisplay implements Observer, DisplayElement {
	
	private Float currentPressure = 29.92f;
	private Float lastPressure;
	private final WeatherData weatherData;
	
	public ForecastDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	public Float getCurrentPressure() {
		return currentPressure;
	}
	
	public Float getLastPressure() {
		return lastPressure;
	}
	
	public void setCurrentPressure(Float currentPressure) {
		this.currentPressure = currentPressure;
	}
	
	public void setLastPressure(Float lastPressure) {
		this.lastPressure = lastPressure;
	}
	
	@Override
	public void update() {
		this.setLastPressure(this.getCurrentPressure());
		this.setCurrentPressure(weatherData.getPressure());
		display();
	}
	
	@Override
	public void display() {
		String forecast;
		
		if (this.getCurrentPressure() > 30f) {
			forecast = "Improving weather on the way!";
		} else if (this.getCurrentPressure() < 29f) {
			forecast = "Watch out for cooler, rainy weather!";
		} else {
			forecast = "More of the same, expect steady conditions.";
		}
		
		System.out.println("Forecast: " + forecast);
	}
}
