package minji.chapter06_commandPattern;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LightOnCommand implements Command{

    Light light;

    @Override
    public void execute() {
        light.on();
    }


}
