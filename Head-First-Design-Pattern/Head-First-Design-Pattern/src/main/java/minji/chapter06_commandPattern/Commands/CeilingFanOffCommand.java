package minji.chapter06_commandPattern.Commands;

import lombok.AllArgsConstructor;
import minji.chapter06_commandPattern.Receivers.CeilingFan;

@AllArgsConstructor
public class CeilingFanOffCommand implements Command {

    CeilingFan ceilingFan;

    @Override
    public void execute() {
        ceilingFan.off();
    }

    @Override
    public void undo() {
        ceilingFan.on();
    }
}
