package minji.chapter01_strategyPattern;

import minji.chapter01_strategyPattern.impl.FlyWings;
import minji.chapter01_strategyPattern.impl.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWings();
    }

    @Override
    public void display() {
        System.out.println("저는 물오리입니다.");
    }
}
