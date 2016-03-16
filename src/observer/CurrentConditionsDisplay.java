package observer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
	
public class CurrentConditionsDisplay implements  DisplayElement {
	private float temperature;
	private float humidity;
	private WeatherData weatherData;
	
	public CurrentConditionsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		//weatherData.registerObserver(this);
		weatherData.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				WeatherData wd = (WeatherData)(arg0.getSource());
				wd.measurementsChanged();
			}			
		});

	}
	
	/*public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}*/
	
	public void display() {
		System.out.println("Current conditions: " + temperature 
			+ "F degrees and " + humidity + "% humidity");
	}
}
