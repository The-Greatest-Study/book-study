package jihong.chapter06_Command.Command.Stereo;

import jihong.chapter06_Command.Command.Command;

public class StereoOffWithCDCommand implements Command {
    Stereo stereo;

    public StereoOffWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
}
