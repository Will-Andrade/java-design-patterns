package org.andradev.displays;

import org.andradev.DisplayElement;
import org.andradev.Observer;
import org.andradev.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	
	private Float temperature;
	private Float humidity;
	private final WeatherData weatherData;
	
	public CurrentConditionsDisplay(WeatherData weatherData) {
		// not only for registering but also to unsubscribe in the future.
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	public Float getTemperature() {
		return temperature;
	}
	
	public Float getHumidity() {
		return humidity;
	}
	
	public void setTemperature(Float temperature) {
		this.temperature = temperature;
	}
	
	public void setHumidity(Float humidity) {
		this.humidity = humidity;
	}
	
	@Override
//	public void update(Float temp, Float humidity, Float pressure) {
	public void update() { // to let it use only the data it needs
		this.setTemperature(weatherData.getTemperature());
		this.setHumidity(weatherData.getHumidity());
		
		// the method is better suited to be called on the View...
		display();
	}
	
	@Override
	public void display() {
		System.out.println("Current Conditions: " + this.getTemperature() + "F " +
			"degrees and " + this.getHumidity() + "% humidity.");
	}
}
