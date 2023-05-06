package minji.chapter06_commandPattern.Receivers;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Stereo {

    String location;

    public void on() {
        System.out.println(location + "Stereo was turned on");
    }

    public void off() {
        System.out.println(location + "Stereo was turned off");
    }

    public void setCd() {
        System.out.println("Playing CD...");
    }

    public void setDvd() {
        System.out.println("Playing DVD...");
    }

    public void setRadio() {
        System.out.println("Playing Radio...");
    }

    public void setVolume(int volume) {
        System.out.println("Setting volume to " + volume);
    }

}
