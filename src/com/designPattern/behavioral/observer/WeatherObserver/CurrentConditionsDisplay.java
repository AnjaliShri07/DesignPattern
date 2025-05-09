package com.designPattern.behavioral.observer.WeatherObserver;

/*Concrete Observers (Display Elements)
These observers get updated when the weather station's data changes.*/
public class CurrentConditionsDisplay implements Observer{
    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity" + "Pressure: "+pressure);
    }
}
