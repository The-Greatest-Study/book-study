package minji.chapter01_strategyPattern.impl;

import minji.chapter01_strategyPattern.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("저는 못 날아요");
    }
}
