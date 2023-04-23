package jiin.chapter04_factory;

import jiin.chapter04_factory.pizza.Pizza;
import jiin.chapter04_factory.pizzaStore.ChicagoPizzaStore;
import jiin.chapter04_factory.pizzaStore.NYPizzaStore;
import jiin.chapter04_factory.pizzaStore.PizzaStore;

public class OrderPizza {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizzaOfEdan = nyStore.orderPizza("cheese");
        System.out.println("에단이 주문한 " + pizzaOfEdan.getName() + "\n");

        Pizza pizzaOfJoel = chicagoStore.orderPizza("cheese");
        System.out.println("조엘이 주문한 " + pizzaOfJoel.getName() + "\n");
    }
}
