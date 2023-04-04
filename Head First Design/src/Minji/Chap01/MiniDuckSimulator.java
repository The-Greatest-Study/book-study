package Minji.Chap01;

import Minji.Chap01.impl.FlyNoWay;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        mallard.setFlyBehavior(new FlyNoWay());
        mallard.performFly();
    }
}
