package Minji.Chap01.impl;

import Minji.Chap01.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< 조용~ >>");
    }
}
