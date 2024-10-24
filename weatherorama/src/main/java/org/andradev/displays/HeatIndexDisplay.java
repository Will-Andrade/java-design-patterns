package org.andradev.displays;

import org.andradev.DisplayElement;
import org.andradev.Observer;
import org.andradev.WeatherData;

public class HeatIndexDisplay implements Observer, DisplayElement {
	
	private Float temperature;
	private Float relativeHumidity;
	private final WeatherData weatherData;
	
	public HeatIndexDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}
	
	public Float getTemperature() {
		return temperature;
	}
	
	public void setTemperature(Float temperature) {
		this.temperature = temperature;
	}
	
	public Float getRelativeHumidity() {
		return relativeHumidity;
	}
	
	public void setRelativeHumidity(Float relativeHumidity) {
		this.relativeHumidity = relativeHumidity;
	}
	
	private float computeHeatIndex(float t, float rh) {
		return (float)((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh) +
			(0.00941695 * (t * t)) + (0.00728898 * (rh * rh)) +
			(0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
			(0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 *
			(rh * rh * rh)) + (0.00000142721 * (t * t * t * rh)) +
			(0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +
			0.000000000843296 * (t * t * rh * rh * rh)) -
			(0.0000000000481975 * (t * t * t * rh * rh * rh)));
	}
	
	@Override
	public void update() {
		this.setTemperature(this.weatherData.getTemperature());
		this.setRelativeHumidity(this.weatherData.getHumidity());
		
		display();
	}
	
	@Override
	public void display() {
		if (this.getTemperature() != null && this.getRelativeHumidity() != null) {
			float heatIndex = this.computeHeatIndex(this.getTemperature(),
				this.getRelativeHumidity());
			
			System.out.printf("Heat Index: %.2f°F\n", heatIndex);
		}
	}
}
