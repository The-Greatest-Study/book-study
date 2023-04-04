package Minji.Chap01.impl;

import Minji.Chap01.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("저는 못 날아요");
    }
}
