package jiin.chapter06_command.command;

import jiin.chapter06_command.home.GarageDoor;

public class GarageDoorOnCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorOnCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
        garageDoor.lightOn();
        System.out.println();
    }

    @Override
    public void undo() {
        garageDoor.stop();
        garageDoor.lightOff();
        garageDoor.down();
        System.out.println();
    }
}
