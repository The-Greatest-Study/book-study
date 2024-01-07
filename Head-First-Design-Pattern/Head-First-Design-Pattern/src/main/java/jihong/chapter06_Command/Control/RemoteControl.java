package jihong.chapter06_Command.Control;

import jihong.chapter06_Command.Command.Command;
import jihong.chapter06_Command.Command.NoCommand;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl() {
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

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuffer bf = new StringBuffer();
        bf.append("\n----- remote control -----\n");

        for (int i = 0; i < 7; i++) {
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
