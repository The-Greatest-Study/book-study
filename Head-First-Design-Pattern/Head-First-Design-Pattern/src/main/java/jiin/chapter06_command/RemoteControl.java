package jiin.chapter06_command;

import jiin.chapter06_command.command.Command;
import jiin.chapter06_command.command.NoCommand;

public class RemoteControl {
    private final int NUM_OF_SLOTS = 7;
    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[NUM_OF_SLOTS];
        offCommands = new Command[NUM_OF_SLOTS];

        for (int i = 0; i < NUM_OF_SLOTS; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }

        undoCommand = new NoCommand();
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPressed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPressed() {
        System.out.println("** undo button is pressed **");
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuffer bf = new StringBuffer();
        bf.append("\n----- remote control -----\n");

        for (int i = 0; i < NUM_OF_SLOTS; i++) {
            bf.append(
                    "slot["
                            + i
                            + "] "
                            + onCommands[i].getClass().getName()
                            + "\t"
                            + offCommands[i].getClass().getName()
                            + "\n");
        }

        bf.append("undo " + undoCommand.getClass().getName() + "\n");

        return bf.toString();
    }
}
