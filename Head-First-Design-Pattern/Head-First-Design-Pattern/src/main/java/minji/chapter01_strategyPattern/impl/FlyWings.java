package minji.chapter01_strategyPattern.impl;

import minji.chapter01_strategyPattern.FlyBehavior;

public class FlyWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("날고 있어요");
    }
}
