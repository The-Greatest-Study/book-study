package minho.chapter07_adapter_and_facade.adapter;

import minho.chapter07_adapter_and_facade.adapter.birds.Duck;
import minho.chapter07_adapter_and_facade.adapter.birds.MallardDuck;
import minho.chapter07_adapter_and_facade.adapter.birds.Turkey;
import minho.chapter07_adapter_and_facade.adapter.birds.WildTurkey;
import minho.chapter07_adapter_and_facade.adapter.birds.adapter.TurkeyAdapter;

public class DuckTestDrive {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();

        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("Turkey said");
        turkey.gobble();
        turkey.fly();

        System.out.println("Duck said");
        testDuck(duck);

        System.out.println("TurkeyAdapter said");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
