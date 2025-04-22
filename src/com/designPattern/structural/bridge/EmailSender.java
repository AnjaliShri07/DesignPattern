package com.designPattern.structural.bridge;

//Concrete Implementor
public class EmailSender implements MessageSender {
    public void sendMessage(String message) {
        System.out.println("Sending Email: " + message);
    }
}
