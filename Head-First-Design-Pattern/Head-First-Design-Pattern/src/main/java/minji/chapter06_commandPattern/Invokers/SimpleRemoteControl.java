package minji.chapter06_commandPattern.Invokers;

import lombok.Data;
import minji.chapter06_commandPattern.Commands.Command;

@Data
public class SimpleRemoteControl {
    Command slot;

    public void setCommand(Command command) {
        this.slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
