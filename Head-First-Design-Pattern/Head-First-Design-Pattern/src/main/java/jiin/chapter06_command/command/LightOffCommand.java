package jiin.chapter06_command.command;

import jiin.chapter06_command.home.Light;

public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
        System.out.println();
    }

    @Override
    public void undo() {
        light.on();
        System.out.println();
    }
}
