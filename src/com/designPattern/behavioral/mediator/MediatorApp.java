package com.designPattern.behavioral.mediator;

public class MediatorApp {
    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoom();

        User john = new ChatUser(chatRoom, "John");
        User alice = new ChatUser(chatRoom, "Alice");
        User bob = new ChatUser(chatRoom, "Bob");

        chatRoom.addUser(john);
        chatRoom.addUser(alice);
        chatRoom.addUser(bob);

        john.send("Hello everyone!");
        alice.send("Hi John!");
    }
}
