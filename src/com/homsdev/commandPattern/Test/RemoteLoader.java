package com.homsdev.commandPattern.Test;

import com.homsdev.commandPattern.commandImpl.*;
import com.homsdev.commandPattern.invoker.RemoteControl;
import com.homsdev.commandPattern.receiver.CeilingFan;
import com.homsdev.commandPattern.receiver.GarageDoor;
import com.homsdev.commandPattern.receiver.Light;
import com.homsdev.commandPattern.receiver.Stereo;

public class RemoteLoader {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan livingRoomCeilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor();
        Stereo livingRoomStereo = new Stereo("Living Room");

        LightOnCommand livingRoomLighOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        CeilingFanOnCommand livingRoomFanOn = new CeilingFanOnCommand(livingRoomCeilingFan);
        CeilingFanOffCommand livingRoomFanOff = new CeilingFanOffCommand(livingRoomCeilingFan);

        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);


        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(livingRoomStereo);

        remoteControl.setCommand(0,livingRoomLighOn,livingRoomLightOff);
        remoteControl.setCommand(1,kitchenLightOn,kitchenLightOff);
        remoteControl.setCommand(2,livingRoomFanOn,livingRoomFanOff);
        //Using lambdas to avoid class creation just if there is only one abstract method on Command interface
        //remoteControl.setCommand(3,stereoOnWithCD,()-> livingRoomStereo.Off());

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
    }
}
