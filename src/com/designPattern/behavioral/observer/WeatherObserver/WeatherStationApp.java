package com.designPattern.behavioral.observer.WeatherObserver;

public class WeatherStationApp {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();

        weatherStation.registerObserver(currentDisplay);
        weatherStation.registerObserver(statisticsDisplay);

        weatherStation.setMeasurements(80, 65, 30.4f);
        weatherStation.setMeasurements(82, 70, 29.2f);
        weatherStation.setMeasurements(78, 90, 29.2f);
    }
}

/*Explanation:
WeatherStation is the subject that maintains a list of observers and notifies them when the weather measurements change.
Observers (like CurrentConditionsDisplay and StatisticsDisplay) implement the Observer interface and get updated via the
update() method.
When weather measurements change, setMeasurements() in WeatherStation updates the internal state and notifies all registered
observers.*/
