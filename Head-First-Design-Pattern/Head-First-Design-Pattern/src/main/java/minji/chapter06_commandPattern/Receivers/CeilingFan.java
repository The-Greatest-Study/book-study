package minji.chapter06_commandPattern.Receivers;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class CeilingFan {

    String location;

    public void on() {
        System.out.println(location + " Ceiling Fan was turned on");
    }

    public void off() {
        System.out.println(location + " Ceiling Fan was turned off");
    }
}
