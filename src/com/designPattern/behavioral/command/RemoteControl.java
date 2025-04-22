package com.designPattern.behavioral.command;

//Invoker Class
public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        if (command != null) {
            command.execute();
        }
    }
}


/*
This is the invoker, representing the remote control.
It holds a reference to a Command.

  The setCommand() method allows dynamic command assignment.

The pressButton() method triggers the command’s execute() method — but it doesn’t care what the command does (this is decoupling!).*/
