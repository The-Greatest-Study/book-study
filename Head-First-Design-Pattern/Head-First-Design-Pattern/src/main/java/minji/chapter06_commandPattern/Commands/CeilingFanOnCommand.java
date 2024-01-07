package minji.chapter06_commandPattern.Commands;

import lombok.AllArgsConstructor;
import minji.chapter06_commandPattern.Receivers.CeilingFan;

@AllArgsConstructor
public class CeilingFanOnCommand implements Command {

    CeilingFan ceilingFan;

    @Override
    public void execute() {
        ceilingFan.on();
    }

    @Override
    public void undo() {
        ceilingFan.off();
    }
}
