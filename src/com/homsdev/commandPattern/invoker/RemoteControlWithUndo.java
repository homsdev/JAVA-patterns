package com.homsdev.commandPattern.invoker;

import com.homsdev.commandPattern.Command;
import com.homsdev.commandPattern.commandImpl.NoCommand;

public class RemoteControlWithUndo {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControlWithUndo() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed(){
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control ------\n");
        for (int i = 0; i < onCommands.length; i++) {
            String line = String.format("slot[%d]: %s       %s", i, onCommands[i].getClass().getSimpleName(), offCommands[i].getClass().getSimpleName());
            stringBuff.append("\n" + line);
        }
        stringBuff.append("\n [undo]: "+undoCommand.getClass().getSimpleName());
        return stringBuff.toString();
    }

}
