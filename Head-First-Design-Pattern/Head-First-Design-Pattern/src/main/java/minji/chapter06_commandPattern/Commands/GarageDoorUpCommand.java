package minji.chapter06_commandPattern.Commands;

import lombok.AllArgsConstructor;
import minji.chapter06_commandPattern.Receivers.GarageDoor;

@AllArgsConstructor
public class GarageDoorUpCommand implements Command {
    GarageDoor garageDoor;

    @Override
    public void execute() {
        garageDoor.up();
    }

    @Override
    public void undo() {
        garageDoor.down();
    }
}
