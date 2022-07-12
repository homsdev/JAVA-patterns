package com.homsdev.commandPattern.commandImpl;

import com.homsdev.commandPattern.Command;
import com.homsdev.commandPattern.receiver.CeilingFan;

public class CeilingFanMediumCommand implements Command {
    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanMediumCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.medium();
    }

    @Override
    public void undo() {
        ceilingFan.setSpeed(prevSpeed);
    }
}
