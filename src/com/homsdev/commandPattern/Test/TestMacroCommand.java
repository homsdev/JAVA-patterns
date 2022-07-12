package com.homsdev.commandPattern.Test;

import com.homsdev.commandPattern.Command;
import com.homsdev.commandPattern.commandImpl.LightOffCommand;
import com.homsdev.commandPattern.commandImpl.LightOnCommand;
import com.homsdev.commandPattern.commandImpl.MacroCommand;
import com.homsdev.commandPattern.commandImpl.StereoOnWithCDCommand;
import com.homsdev.commandPattern.invoker.RemoteControl;
import com.homsdev.commandPattern.receiver.Light;
import com.homsdev.commandPattern.receiver.Stereo;

public class TestMacroCommand {
    public static void main(String[] args) {
        Light light = new Light("living Room");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand lightOn = new LightOnCommand(light);
        StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);

        LightOffCommand lightOff = new LightOffCommand(light);

        Command[] partyOn = {lightOn,stereoOn};
        Command[] partyOff= {lightOff,lightOff};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(0,partyOnMacro,partyOffMacro);
        System.out.println(remoteControl);
        System.out.println("---Pushing Macro On---");
        remoteControl.onButtonWasPushed(0);
        System.out.println("---Pushing Macro Off---");
        remoteControl.offButtonWasPushed(0);
    }
}
