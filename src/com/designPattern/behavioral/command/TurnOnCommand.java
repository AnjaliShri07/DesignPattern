package com.designPattern.behavioral.command;

//Concrete Command Class
public class TurnOnCommand  implements Command {
    private final Light light;

    public TurnOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}
