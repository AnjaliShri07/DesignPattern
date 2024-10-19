package com.designPattern.behavioral.Observer;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        Observer observer1 = new ConcreteObserver1();
        Observer observer2 = new ConcreteObserver2();

        subject.addObserver(observer1);
        subject.addObserver(observer2);

        subject.setState("State 1");
        subject.setState("State 2");
    }
}

/*Explanation:
The Subject holds the state and notifies all registered Observers when the state changes.
The Observers receive updates and respond by executing the update method with the new state information.
This pattern decouples the subject (observable) from the observers, promoting loose coupling between components.

Common Use Cases:
Event listeners in GUI frameworks.
        Model-View-Controller (MVC) architecture, where the view observes the model for state changes.
Real-time data feeds, where multiple consumers (observers) need to be updated when new data is available.*/
