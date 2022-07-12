package com.homsdev.commandPattern.Test;


import com.homsdev.commandPattern.commandImpl.GarageDoorOpenCommand;
import com.homsdev.commandPattern.commandImpl.LightOnCommand;
import com.homsdev.commandPattern.receiver.GarageDoor;
import com.homsdev.commandPattern.receiver.Light;

public class RemotecontrolTest {

    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();//Invoker

        Light light = new Light("Living Room");
        LightOnCommand lightOn = new LightOnCommand(light);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand openGarage = new GarageDoorOpenCommand(garageDoor);

        remote.setCommand(openGarage);
        remote.buttonWasPressed();
    }
}
