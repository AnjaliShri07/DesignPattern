package com.designPattern.behavioral.mediator;

//Mediator Interface
public interface ChatMediator {
    void sendMessage(String message, User user);
    void addUser(User user);
}
