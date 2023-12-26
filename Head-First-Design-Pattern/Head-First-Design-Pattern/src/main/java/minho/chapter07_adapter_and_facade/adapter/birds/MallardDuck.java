package minho.chapter07_adapter_and_facade.adapter.birds;

public class MallardDuck implements Duck{
    @Override
    public void quack() {
        System.out.println("quack");
    }

    @Override
    public void fly() {
        System.out.println("Flying!!!");
    }
}
