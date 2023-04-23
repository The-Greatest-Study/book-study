package jihong.chapter04_Factory;

import jihong.chapter04_Factory.Pizza.Pizza;
import jihong.chapter04_Factory.Store.ChicagoPizzaStore;
import jihong.chapter04_Factory.Store.NYPizzaStore;
import jihong.chapter04_Factory.Store.PizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("에단이 주문한" + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("조엘이 주문한" + pizza.getName() + "\n");
    }
}
