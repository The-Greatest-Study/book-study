package minji.chapter01_strategyPattern.impl;

import minji.chapter01_strategyPattern.QuackBehavior;

public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("삑");
    }
}
