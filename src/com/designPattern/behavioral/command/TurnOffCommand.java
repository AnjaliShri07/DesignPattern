package com.designPattern.behavioral.command;

//Concrete Command Class
public class TurnOffCommand implements Command {
    private final Light light;

    public TurnOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}

/*These are concrete implementations of the Command interface.
    Each one wraps a Light object and calls the appropriate method when execute() is triggered.
 They encapsulate the action of turning the light on or off.*/
