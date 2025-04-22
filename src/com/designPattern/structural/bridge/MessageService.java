package com.designPattern.structural.bridge;

public class MessageService {
    public static void main(String[] args) {
        MessageSender sms = new SmsSender();
        MessageSender email = new EmailSender();
        MessageSender push = new PushNotificationSender();

        Message msg1 = new TextMessage(sms);
        msg1.send("Hello via SMS");

        Message msg2 = new EmailMessage(email);
        msg2.send("Hello via Email");

        Message msg3 = new TextMessage(push);
        msg3.send("Urgent alert via Push");
    }
}
