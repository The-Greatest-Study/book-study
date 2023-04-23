package minji.chapter04_factoryPattern;

import minji.chapter04_factoryPattern.pizzaStore.ChicagoPizzaStore;
import minji.chapter04_factoryPattern.pizzaStore.NYPizzaStore;
import minji.chapter04_factoryPattern.pizzaStore.PizzaStore;

public class OrderPizza {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        nyPizzaStore.orderPizza("cheese");
        nyPizzaStore.orderPizza("pepperoni");
        chicagoPizzaStore.orderPizza("veggie");
        chicagoPizzaStore.orderPizza("clam");
    }
}
