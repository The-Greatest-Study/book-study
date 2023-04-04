package minji.chapter01_strategyPattern.impl;

import minji.chapter01_strategyPattern.QuackBehavior;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("<< 조용~ >>");
    }
}
