package org.andradev;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
	
	private List<Observer> observers;
	private Float temperature;
	private Float humidity;
	private Float pressure;
	
	public WeatherData() {
		this.observers = new ArrayList<Observer>();
	}
	
	public void measurementsChanged() {
		this.notifyObservers();
	}
	
	public Float getTemperature() {
		return temperature;
	}
	
	public Float getHumidity() {
		return humidity;
	}
	
	public Float getPressure() {
		return pressure;
	}
	
	public void setMeasurements(Float temperature, Float humidity,
	                            Float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		
		measurementsChanged();
	}
	
	@Override
	public void registerObserver(Observer o) {
		this.observers.add(o);
	}
	
	@Override
	public void removeObserver(Observer o) {
		this.observers.remove(o);
	}
	
	@Override
	public void notifyObservers() {
		for(Observer o : this.observers) {
//			o.update(this.getTemperature(), this.getHumidity(), this.getPressure());
			o.update(); // to let the observers get whatever props they need
		}
	}
}
