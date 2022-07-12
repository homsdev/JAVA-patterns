package com.homsdev.commandPattern.invoker;

import com.homsdev.commandPattern.Command;
import com.homsdev.commandPattern.commandImpl.NoCommand;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    @Override
    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control ------\n");
        for (int i = 0; i < onCommands.length; i++) {
            String line = String.format("slot[%d]: %s       %s", i, onCommands[i].getClass().getSimpleName(), offCommands[i].getClass().getSimpleName());
            stringBuff.append("\n" + line);
        }
        return stringBuff.toString();
    }
}
