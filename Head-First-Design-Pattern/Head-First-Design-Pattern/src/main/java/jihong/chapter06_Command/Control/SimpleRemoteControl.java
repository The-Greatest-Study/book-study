package jihong.chapter06_Command.Control;

import jihong.chapter06_Command.Command.Command;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class SimpleRemoteControl {
    Command slot;

    public void setCommand(Command command){
        slot = command;
    }
    public void buttonWasPressed(){
        slot.execute();
    }
}
