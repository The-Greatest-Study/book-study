package minho.chapter07_adapter_and_facade.adapter.birds;

public class WildTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("gobble");
    }

    @Override
    public void fly() {
        System.out.println("Flying shortly");
    }
}
