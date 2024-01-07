package minji.chapter06_commandPattern;

import minji.chapter06_commandPattern.Commands.GarageDoorUpCommand;
import minji.chapter06_commandPattern.Commands.LightOnCommand;
import minji.chapter06_commandPattern.Invokers.SimpleRemoteControl;
import minji.chapter06_commandPattern.Receivers.GarageDoor;
import minji.chapter06_commandPattern.Receivers.Light;

public class RemoteControlTest {
    // 클라이언트
    public static void main(String[] args) {
        // 인보커
        SimpleRemoteControl remote = new SimpleRemoteControl();
        // 리시버
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();

        // 커맨드
        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoorUpCommand garageOpen = new GarageDoorUpCommand(garageDoor);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(garageOpen);
        remote.buttonWasPressed();
    }
}
