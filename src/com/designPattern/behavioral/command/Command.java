package com.designPattern.behavioral.command;

//Command Interface
public interface Command {
    void execute();
}

/*This is the base interface.

Any operation that needs to be executed (like turning the light on/off) must implement this.

execute() method will be overridden by each specific command.*/
