package com.designPattern.behavioral.command;

//Client Code
public class CommandApp {
    public static void main(String[] args) {
        Light light = new Light(); // receiver

        Command lightOn = new TurnOnCommand(light);
        Command lightOff = new TurnOffCommand(light);

        RemoteControl remote = new RemoteControl(); // invoker

        remote.setCommand(lightOn);
        remote.pressButton(); // Output: Light is ON

        remote.setCommand(lightOff);
        remote.pressButton(); // Output: Light is OFF
    }
}
/*
This is the client that wires everything together.
It creates the Light object (the receiver).
Then creates command objects (TurnOnCommand, TurnOffCommand) that encapsulate the receiver.
Sets the commands to the RemoteControl and executes them via pressButton().

✅ What We Achieved
The RemoteControl has no idea about the logic of turning the light on or off.
Each command is a self-contained object with a reference to the target (Light).

This allows:
Dynamic command assignment
Future support for command queues, undo, logging, etc.
*/
