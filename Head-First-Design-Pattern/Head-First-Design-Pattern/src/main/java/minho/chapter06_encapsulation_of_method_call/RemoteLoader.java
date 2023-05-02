package minho.chapter06_encapsulation_of_method_call;

import minho.chapter06_encapsulation_of_method_call.EquipCommands.LightOffCommand;
import minho.chapter06_encapsulation_of_method_call.EquipCommands.LightOnCommand;
import minho.chapter06_encapsulation_of_method_call.Equipments.Light;
import minho.chapter06_encapsulation_of_method_call.RemoteControls.HashedRemoteControl;

public class RemoteLoader {
    public static final String LIVING_ROOM_LIGHT = "livingRoomLight";
    public static final String KITCHEN_LIGHT = "kitchenLight";

    public static void main(String[] args) {
        HashedRemoteControl remoteControl = new HashedRemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        remoteControl.setCommand(LIVING_ROOM_LIGHT, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(KITCHEN_LIGHT, kitchenLightOn, kitchenLightOff);

        remoteControl.onButtonWasPushed(LIVING_ROOM_LIGHT);
        remoteControl.offButtonWasPushed(LIVING_ROOM_LIGHT);
        remoteControl.onButtonWasPushed(KITCHEN_LIGHT);
        remoteControl.offButtonWasPushed(KITCHEN_LIGHT);
        remoteControl.undoButtonWasPushed();
        System.out.println(remoteControl);
    }
}
