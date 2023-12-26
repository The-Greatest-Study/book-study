package jiin.chapter07_adapter;

import lombok.AllArgsConstructor;

import java.util.concurrent.ThreadLocalRandom;

@AllArgsConstructor
public class DuckAdapter implements Turkey {
    private Duck duck;

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        if(ThreadLocalRandom.current().nextInt(5) == 0){
            duck.fly();
        }
    }
}
