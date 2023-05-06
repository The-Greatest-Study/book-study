package jihong.chapter06_Command;

import jihong.chapter06_Command.Command.CeilingFan.CeilingFan;
import jihong.chapter06_Command.Command.CeilingFan.CeilingFanHighCommand;
import jihong.chapter06_Command.Command.CeilingFan.CeilingFanMediumCommand;
import jihong.chapter06_Command.Command.CeilingFan.CeilingFanOffCommand;
import jihong.chapter06_Command.Command.Command;
import jihong.chapter06_Command.Command.MacroCommand;
import jihong.chapter06_Command.Control.RemoteControl;
import jihong.chapter06_Command.Command.Light.Light;
import jihong.chapter06_Command.Command.Light.LightOffCommand;
import jihong.chapter06_Command.Command.Light.LightOnCommand;
import jihong.chapter06_Command.Command.Stereo.Stereo;
import jihong.chapter06_Command.Command.Stereo.StereoOffWithCDCommand;
import jihong.chapter06_Command.Command.Stereo.StereoOnWithCDCommand;

public class RemoteLoader {
    private static final String LIVING_ROOM = "Living Room";
    private static final String KITCHEN = "Kitchen";

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        /**
         * 가전
         */
        Light livingRoomLight = new Light(LIVING_ROOM);
        CeilingFan livingCeilingFan = new CeilingFan(LIVING_ROOM);
        Stereo livingStereo = new Stereo(LIVING_ROOM);


        System.out.println("\n\n------Light Test------");
        remoteControl.setCommand(0, new LightOnCommand(livingRoomLight), new LightOffCommand(livingRoomLight));

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
//        System.out.println(remoteControl);

        remoteControl.undoButtonWasPushed();
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(0);
//        System.out.println(remoteControl);

        remoteControl.undoButtonWasPushed();

        /**
         * CeilingFan Test
         */

        System.out.println("\n\n------CeilingFan Test------");

        remoteControl.setCommand(1, new CeilingFanMediumCommand(livingCeilingFan), new CeilingFanOffCommand(livingCeilingFan));
        remoteControl.setCommand(2, new CeilingFanHighCommand(livingCeilingFan), new CeilingFanOffCommand(livingCeilingFan));

        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
//        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(2);
//        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();


        System.out.println("\n\n------Macro Test------");
        Command[] partyOn = {new LightOnCommand(livingRoomLight), new StereoOnWithCDCommand(livingStereo)};
        Command[] partyOff = {new LightOffCommand(livingRoomLight), new StereoOffWithCDCommand(livingStereo)};


        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(3, partyOnMacro, partyOffMacro);

        System.out.println("\n------Macro On------");
        remoteControl.onButtonWasPushed(3);

        System.out.println("\n------Macro Off------");
        remoteControl.offButtonWasPushed(3);


    }
}
