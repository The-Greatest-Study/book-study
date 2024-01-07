package jiin.chapter06_command.command;

import jiin.chapter06_command.home.GarageDoor;

public class GarageDoorOffCommand implements Command {
    private GarageDoor garageDoor;

    public GarageDoorOffCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.lightOff();
        garageDoor.down();
        System.out.println();
    }

    @Override
    public void undo() {
        garageDoor.stop();
        garageDoor.lightOn();
        garageDoor.up();
        System.out.println();
    }
}
