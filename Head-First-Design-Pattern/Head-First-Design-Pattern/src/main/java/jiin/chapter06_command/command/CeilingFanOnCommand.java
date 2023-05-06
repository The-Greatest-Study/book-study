package jiin.chapter06_command.command;

import jiin.chapter06_command.home.CeilingFan;

public class CeilingFanOnCommand implements Command {
    private CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        switch (ceilingFan.getSpeed()){
            case CeilingFan.OFF -> ceilingFan.low();
            case CeilingFan.LOW -> ceilingFan.medium();
            case CeilingFan.MEDIUM -> ceilingFan.high();
            case CeilingFan.HIGH -> ceilingFan.off();
        }
        System.out.println();
    }

    @Override
    public void undo() {
        switch (ceilingFan.getSpeed()){
            case CeilingFan.OFF -> ceilingFan.high();
            case CeilingFan.LOW -> ceilingFan.off();
            case CeilingFan.MEDIUM -> ceilingFan.low();
            case CeilingFan.HIGH -> ceilingFan.medium();
        }
        System.out.println();
    }
}
