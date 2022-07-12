package com.homsdev.commandPattern.commandImpl;

import com.homsdev.commandPattern.Command;
import com.homsdev.commandPattern.receiver.CeilingFan;

public class CeilingFanHighCommand implements Command {

    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
    }

    @Override
    public void undo() {
        ceilingFan.setSpeed(prevSpeed);
    }
}
