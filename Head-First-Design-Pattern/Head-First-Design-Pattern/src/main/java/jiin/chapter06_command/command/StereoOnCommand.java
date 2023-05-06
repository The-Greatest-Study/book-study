package jiin.chapter06_command.command;

import jiin.chapter06_command.home.Stereo;

public class StereoOnCommand implements Command {
    private Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setRadio();
        stereo.setVolume(5);
        System.out.println();
    }

    @Override
    public void undo() {
        stereo.off();
        System.out.println();
    }
}
