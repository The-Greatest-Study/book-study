package Minji.Chap01.impl;

import Minji.Chap01.QuackBehavior;

public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("꽥");
    }
}
