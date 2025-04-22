package com.designPattern.behavioral.mediator;

//Concrete User
public class ChatUser extends User {

    public ChatUser(ChatMediator chatMediator, String name) {
        super(chatMediator, name);

        /*is calling the constructor of the superclass (User) and passing two arguments to it:
        chatMediator: The mediator (like the chat room) that will handle communication
        name: The name of this user*/
    }

    @Override
    public void send(String message) {
        System.out.println(name + " sends: " + message);
        chatMediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message, String from) {
        System.out.println(name + " received from " + from + ": " + message);
    }
}
