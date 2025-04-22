package com.designPattern.structural.bridge;

public class TextMessage extends Message {
    public TextMessage(MessageSender sender) {
        super(sender);
    }

    public void send(String messageText) {
        sender.sendMessage("[Text] " + messageText);
    }
}
