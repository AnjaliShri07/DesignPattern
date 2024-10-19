package com.designPattern.behavioral.Observer;

public class ConcreteObserver1 implements Observer{
    @Override
    public void update(String message) {
        System.out.println("ConcreteObserver1 received update: " + message);
    }
}
