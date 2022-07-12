package com.homsdev.commandPattern.commandImpl;

import com.homsdev.commandPattern.Command;
import com.homsdev.commandPattern.receiver.Light;

public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
