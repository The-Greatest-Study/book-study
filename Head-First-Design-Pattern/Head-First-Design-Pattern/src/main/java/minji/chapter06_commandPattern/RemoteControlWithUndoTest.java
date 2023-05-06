package minji.chapter06_commandPattern;

import minji.chapter06_commandPattern.Commands.GarageDoorUpCommand;
import minji.chapter06_commandPattern.Commands.LightOffCommand;
import minji.chapter06_commandPattern.Commands.LightOnCommand;
import minji.chapter06_commandPattern.Invokers.RemoteControl;
import minji.chapter06_commandPattern.Invokers.RemoteControlWithUndo;
import minji.chapter06_commandPattern.Invokers.SimpleRemoteControl;
import minji.chapter06_commandPattern.Receivers.CeilingFan;
import minji.chapter06_commandPattern.Receivers.GarageDoor;
import minji.chapter06_commandPattern.Receivers.Light;
import minji.chapter06_commandPattern.Receivers.Stereo;

public class RemoteControlWithUndoTest {
    // 클라이언트
    public static void main(String[] args) {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        Light livingRoomLight = new Light("Living Room");

        LightOnCommand livingRoomLightOn =
                new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff =
                new LightOffCommand(livingRoomLight);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
    }
}
