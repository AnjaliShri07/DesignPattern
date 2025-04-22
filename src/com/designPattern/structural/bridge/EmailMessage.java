package com.designPattern.structural.bridge;

public class EmailMessage extends Message {
    public EmailMessage(MessageSender sender) {
        super(sender);
    }

    public void send(String messageText) {
        sender.sendMessage("[Email] " + messageText);
    }
}
