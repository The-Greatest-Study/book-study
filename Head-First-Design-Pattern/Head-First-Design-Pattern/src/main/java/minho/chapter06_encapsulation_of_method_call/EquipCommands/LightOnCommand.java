package minho.chapter06_encapsulation_of_method_call.EquipCommands;

import minho.chapter06_encapsulation_of_method_call.Equipments.Light;

public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
