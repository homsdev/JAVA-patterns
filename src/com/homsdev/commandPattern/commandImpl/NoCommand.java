package com.homsdev.commandPattern.commandImpl;

import com.homsdev.commandPattern.Command;

public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("NoCommand");
    }

    @Override
    public void undo() {

    }
}
