package com.homsdev.commandPattern.commandImpl;

import com.homsdev.commandPattern.Command;

public class MacroCommand implements Command {
    Command commands[];

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }

    @Override
    public void undo() {

    }
}
