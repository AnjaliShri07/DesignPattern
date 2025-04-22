package com.designPattern.behavioral.observer.ObserverDemo;

public class ConcreteObserver2 implements Observer{
    @Override
    public void update(String message) {
        System.out.println("ConcreteObserver2 received update: " + message);
    }
}
