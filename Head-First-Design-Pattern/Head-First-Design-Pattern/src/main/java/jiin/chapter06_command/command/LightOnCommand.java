package jiin.chapter06_command.command;

import jiin.chapter06_command.home.Light;

public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
        System.out.println();
    }

    @Override
    public void undo() {
        light.off();
        System.out.println();
    }
}
