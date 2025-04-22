package com.designPattern.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

//Concrete Mediator
public class ChatRoom implements ChatMediator {
    private final List<User> users = new ArrayList<>();

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(String message, User sender) {
        for (User user : users) {
            if (user != sender) {
                user.receive(message, sender.getName());
            }
        }
    }
}
/*
This is the central hub (mediator).
It forwards messages from the sender to other users.
Users don’t talk to each other directly — only through the ChatRoom.*/
