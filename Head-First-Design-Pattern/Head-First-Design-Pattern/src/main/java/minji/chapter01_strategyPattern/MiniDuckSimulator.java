package minji.chapter01_strategyPattern;

import minji.chapter01_strategyPattern.impl.FlyNoWay;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        mallard.setFlyBehavior(new FlyNoWay());
        mallard.performFly();
    }
}
