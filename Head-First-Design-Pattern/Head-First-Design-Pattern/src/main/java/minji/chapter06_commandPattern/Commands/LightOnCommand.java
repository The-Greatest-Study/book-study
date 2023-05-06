package minji.chapter06_commandPattern.Commands;

import lombok.AllArgsConstructor;
import minji.chapter06_commandPattern.Receivers.Light;


@AllArgsConstructor
public class LightOnCommand implements Command {

    Light light;

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
