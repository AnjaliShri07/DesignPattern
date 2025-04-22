package com.designPattern.behavioral.observer.WeatherObserver;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
