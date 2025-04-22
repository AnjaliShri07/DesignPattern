package com.designPattern.structural.bridge;

//Concrete Implementor
public class SmsSender implements MessageSender {
    public void sendMessage(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

