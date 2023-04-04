package minji.chapter01_strategyPattern.impl;

import minji.chapter01_strategyPattern.QuackBehavior;

public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("꽥");
    }
}
