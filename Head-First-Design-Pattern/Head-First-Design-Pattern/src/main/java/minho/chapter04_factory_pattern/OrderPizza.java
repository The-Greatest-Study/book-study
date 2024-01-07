package minho.chapter04_factory_pattern;

import minho.chapter04_factory_pattern.PizzaStore.ChicagoPizzaStore;
import minho.chapter04_factory_pattern.PizzaStore.NYPizzaStore;
import minho.chapter04_factory_pattern.PizzaStore.PizzaStore;

public class OrderPizza {
    public static void main(String[] args) {
        PizzaStore nYPizzaStore = new NYPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        nYPizzaStore.orderPizza("cheese");
        nYPizzaStore.orderPizza("pepperoni");
        chicagoPizzaStore.orderPizza("veggie");
        chicagoPizzaStore.orderPizza("clams");
    }
}
