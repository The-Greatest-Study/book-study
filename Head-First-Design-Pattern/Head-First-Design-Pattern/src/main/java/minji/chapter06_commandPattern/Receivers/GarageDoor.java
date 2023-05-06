package minji.chapter06_commandPattern.Receivers;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class GarageDoor {

    String location;

    public void up() {
        System.out.println(location + " Going up");
    }

    public void down() {
        System.out.println(location + " It's going down");
    }

    public void stop() {
        System.out.println("Stopping...");
    }

    public void lightOn() {
        System.out.println("Turning the light on");
    }

    public void lightOff() {
        System.out.println("Turhing the light off");
    }
}
