package minji.chapter06_commandPattern.Receivers;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Light {

    String location;

    public void on() {
        System.out.println(location + " Light was turned on");
    }

    public void off() {
        System.out.println(location + " Light was turned off");
    }
}
