package com.homsdev.commandPattern.commandImpl;

import com.homsdev.commandPattern.Command;
import com.homsdev.commandPattern.receiver.GarageDoor;

public class GarageDoorOpenCommand implements Command {

    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }

    @Override
    public void undo() {

    }
}
