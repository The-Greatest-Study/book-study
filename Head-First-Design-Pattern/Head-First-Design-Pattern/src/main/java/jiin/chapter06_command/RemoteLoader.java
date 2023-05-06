package jiin.chapter06_command;

import jiin.chapter06_command.command.CeilingFanOffCommand;
import jiin.chapter06_command.command.CeilingFanOnCommand;
import jiin.chapter06_command.command.GarageDoorOffCommand;
import jiin.chapter06_command.command.GarageDoorOnCommand;
import jiin.chapter06_command.command.LightOffCommand;
import jiin.chapter06_command.command.LightOnCommand;
import jiin.chapter06_command.command.StereoOffCommand;
import jiin.chapter06_command.command.StereoOnCommand;
import jiin.chapter06_command.home.CeilingFan;
import jiin.chapter06_command.home.GarageDoor;
import jiin.chapter06_command.home.Light;
import jiin.chapter06_command.home.Stereo;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("Garage");
        Stereo stereo = new Stereo("Living Room");

        remoteControl.setCommand(0, new LightOnCommand(livingRoomLight), new LightOffCommand(livingRoomLight));
        remoteControl.setCommand(1, new LightOnCommand(kitchenLight), new LightOffCommand(kitchenLight));
        remoteControl.setCommand(2, new CeilingFanOnCommand(ceilingFan), new CeilingFanOffCommand(ceilingFan));
        remoteControl.setCommand(3, new GarageDoorOnCommand(garageDoor), new GarageDoorOffCommand(garageDoor));
        remoteControl.setCommand(4, new StereoOnCommand(stereo), new StereoOffCommand(stereo));

        System.out.println(remoteControl);

        System.out.println("----- start -----");
        remoteControl.onButtonWasPressed(0);
        remoteControl.onButtonWasPressed(1);
        remoteControl.onButtonWasPressed(2);
        remoteControl.offButtonWasPressed(2);
        remoteControl.onButtonWasPressed(3);
        remoteControl.offButtonWasPressed(3);
        remoteControl.undoButtonWasPressed();
        remoteControl.onButtonWasPressed(4);
        remoteControl.offButtonWasPressed(4);
    }
}
