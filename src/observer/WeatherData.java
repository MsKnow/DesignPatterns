package observer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class WeatherData {
	private ArrayList<ActionListener> listeners;
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData() {
		listeners = new ArrayList<ActionListener>();
	}

	public void addActionListener(ActionListener o) {
		listeners.add(o);
	}

	public void removeActionListener(ActionListener o) {

	}

	public void processEvent(ActionEvent o) {

		for (ActionListener listener : listeners) {
			// observer.update(temperature, humidity, pressure);
			listener.actionPerformed(o);
		}
	}

	public void measurementsChanged() {
		// notifyObservers();
		processEvent(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, null));
	}

	/*
	 * public void registerObserver(Observer o) { observers.add(o); }
	 * 
	 * public void removeObserver(Observer o) { int i = observers.indexOf(o); if
	 * (i >= 0) { observers.remove(i); } }
	 * 
	 * public void notifyObservers() { for (Observer observer : observers) {
	 * observer.update(temperature, humidity, pressure); } }
	 * 
	 * public void measurementsChanged() { notifyObservers(); }
	 */
	public void setMeasurements(float temperature, float humidity,
			float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}

}
