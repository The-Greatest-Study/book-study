package Minji.Chap01;

import Minji.Chap01.impl.FlyWings;
import Minji.Chap01.impl.Quack;

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
