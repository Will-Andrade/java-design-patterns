package org.andradev.displays;

import org.andradev.DisplayElement;
import org.andradev.Observer;
import org.andradev.WeatherData;

public class StatisticsDisplay implements Observer, DisplayElement {
	
	private Float temperature;
	private Float humidity;
	private Float pressure;
	private final WeatherData weatherData;
	
	private Float minTemperature = null;
	private Float maxTemperature = null;
	private Float totalTemperature = 0f;
	private Integer numberOfReadings = 0;
	
	public StatisticsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	public Float getPressure() {
		return pressure;
	}
	
	public Float getHumidity() {
		return humidity;
	}
	
	public Float getTemperature() {
		return temperature;
	}
	
	public Float getMinTemperature() {
		return minTemperature;
	}
	
	public Float getMaxTemperature() {
		return maxTemperature;
	}
	
	public Float getTotalTemperature() {
		return totalTemperature;
	}
	
	public Integer getNumberOfReadings() {
		return numberOfReadings;
	}
	
	public void setTemperature(Float temperature) {
		this.temperature = temperature;
	}
	
	public void setHumidity(Float humidity) {
		this.humidity = humidity;
	}
	
	public void setPressure(Float pressure) {
		this.pressure = pressure;
	}
	
	public void setTotalTemperature(Float totalTemperature) {
		this.totalTemperature += totalTemperature;
	}
	
	public void setMinTemperature(Float minTemperature) {
		this.minTemperature = minTemperature;
	}
	
	public void setMaxTemperature(Float maxTemperature) {
		this.maxTemperature = maxTemperature;
	}
	
	@Override
	public void update() {
		this.setTemperature(weatherData.getTemperature());
		this.setHumidity(weatherData.getHumidity());
		this.setPressure(weatherData.getPressure());
		
		this.setTotalTemperature(this.getTemperature());
		this.numberOfReadings++;
		
		if (minTemperature == null || maxTemperature == null) {
			minTemperature = temperature;
			maxTemperature = temperature;
		} else {
			if (this.getTemperature() > this.getMaxTemperature()) {
				this.setMaxTemperature(this.getTemperature());
			}
			
			if (this.getTemperature() < this.getMinTemperature()) {
				this.setMinTemperature(this.getTemperature());
			}
		}
		
		display();
	}
	
	@Override
	public void display() {
		float averageTemp = this.getTotalTemperature() / this.getNumberOfReadings();
		
		System.out.println("AVG/MIN/MAX Temperatures: " + averageTemp + "°F / " +
			this.getMinTemperature() + "°F / " + this.getMaxTemperature() + "°F");
	}
}
