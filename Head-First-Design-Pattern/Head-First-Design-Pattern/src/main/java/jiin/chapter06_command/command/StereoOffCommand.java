package jiin.chapter06_command.command;

import jiin.chapter06_command.home.Stereo;

public class StereoOffCommand implements Command {
    private Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
        System.out.println();
    }

    @Override
    public void undo() {
        stereo.on();
        stereo.setRadio();
        stereo.setVolume(5);
        System.out.println();
    }
}
