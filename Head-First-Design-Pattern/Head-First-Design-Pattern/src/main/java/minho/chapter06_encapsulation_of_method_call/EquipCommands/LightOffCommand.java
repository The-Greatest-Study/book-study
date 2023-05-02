package minho.chapter06_encapsulation_of_method_call.EquipCommands;

import minho.chapter06_encapsulation_of_method_call.Equipments.Light;

public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.off();
    }

    @Override
    public void undo() {
        this.light.on();
    }
}
