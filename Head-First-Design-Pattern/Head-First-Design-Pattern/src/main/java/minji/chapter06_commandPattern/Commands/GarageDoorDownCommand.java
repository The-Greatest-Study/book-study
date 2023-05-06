package minji.chapter06_commandPattern.Commands;

import lombok.AllArgsConstructor;
import minji.chapter06_commandPattern.Receivers.GarageDoor;

@AllArgsConstructor
public class GarageDoorDownCommand implements Command {
    GarageDoor garageDoor;

    @Override
    public void execute() {
        garageDoor.down();
    }

    @Override
    public void undo() {
        garageDoor.up();
    }
}
