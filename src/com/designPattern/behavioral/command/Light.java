package com.designPattern.behavioral.command;

//Receiver Class
public class Light {
    public void turnOn() {
        System.out.println("Light is ON");
    }

    public void turnOff() {
        System.out.println("Light is OFF");
    }
}

/*
Light is the receiver, the actual object that performs the operation.
It contains real business logic: methods turnOn() and turnOff().*/
