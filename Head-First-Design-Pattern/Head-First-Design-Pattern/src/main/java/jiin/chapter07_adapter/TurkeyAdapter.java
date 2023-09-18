package jiin.chapter07_adapter;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TurkeyAdapter implements Duck{
    private Turkey turkey;
    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for(int i = 0; i < 5; i++){
            turkey.fly();
        }
    }
}
