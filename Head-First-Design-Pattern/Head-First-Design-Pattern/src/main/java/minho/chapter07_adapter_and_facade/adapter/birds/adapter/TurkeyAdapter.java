package minho.chapter07_adapter_and_facade.adapter.birds.adapter;

import lombok.RequiredArgsConstructor;
import minho.chapter07_adapter_and_facade.adapter.birds.Duck;
import minho.chapter07_adapter_and_facade.adapter.birds.Turkey;

@RequiredArgsConstructor
public class TurkeyAdapter implements Duck {
    private final Turkey turkey;

    @Override
    public void quack() {
        this.turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            this.turkey.fly();
        }
    }
}
