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

	public void addActionListener(ActionListener listener) {
		listeners.add(listener);
	}

	public void removeActionListener(ActionListener o) {

	}
	//传入一个actionEvent like网络获取的结果 结果是三个测量结果 放在成员变量中 然后把自己传过去，包装在actionEvent中
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
