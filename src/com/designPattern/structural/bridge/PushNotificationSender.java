package com.designPattern.structural.bridge;

//Concrete Implementor
public class PushNotificationSender implements MessageSender {
    public void sendMessage(String message) {
        System.out.println("Sending Push Notification: " + message);
    }
}
