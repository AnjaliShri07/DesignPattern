package com.designPattern.behavioral.observer.WeatherObserver;

/*The Observer Design Pattern defines a one-to-many dependency between objects so that when one object (the subject)
changes state, all its dependents (the observers) are notified and updated automatically.
This pattern is commonly used to implement distributed event-handling systems.

Components:
Subject (WeatherStation): This is the subject that holds a list of observers and notifies them of any changes.
Observer (Displays): These are the observers (e.g., different display elements) that get updated when the weather
station's data changes.*/

//Observer
public interface Observer {
    void update(float temperature, float humidity, float pressure);
}
