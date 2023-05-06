package minji.chapter06_commandPattern.Commands;

import lombok.AllArgsConstructor;
import minji.chapter06_commandPattern.Receivers.Stereo;

@AllArgsConstructor
public class StereoOffCommand implements Command{

    Stereo stereo;

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
    }
}
