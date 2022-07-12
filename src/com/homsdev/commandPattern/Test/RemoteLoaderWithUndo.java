package com.homsdev.commandPattern.Test;

import com.homsdev.commandPattern.commandImpl.*;
import com.homsdev.commandPattern.invoker.RemoteControlWithUndo;
import com.homsdev.commandPattern.receiver.CeilingFan;
import com.homsdev.commandPattern.receiver.Light;

public class RemoteLoaderWithUndo {
    public static void main(String[] args) {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        Light livingRoomLight = new Light("Living Room");

        LightOnCommand livingRoomOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomOff = new LightOffCommand(livingRoomLight);

        remoteControl.setCommand(0,livingRoomOn,livingRoomOff);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();

        System.out.println("================== FAN TEST ======================");

        CeilingFan ceilingFan = new CeilingFan("Living Room");
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);


        remoteControl.setCommand(0,ceilingFanMediumCommand,ceilingFanOffCommand);
        remoteControl.setCommand(1,ceilingFanHighCommand,ceilingFanOffCommand);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
    }
}
