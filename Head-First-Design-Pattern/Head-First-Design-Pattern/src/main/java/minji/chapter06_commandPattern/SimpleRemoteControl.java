package minji.chapter06_commandPattern;

import lombok.Data;

@Data
public class SimpleRemoteControl {
    Command slot;

    public void buttonWasPressed() {
        slot.execute();
    }
}
