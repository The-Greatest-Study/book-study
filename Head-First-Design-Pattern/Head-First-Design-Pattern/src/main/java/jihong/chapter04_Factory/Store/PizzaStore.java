package jihong.chapter04_Factory.Store;

import jihong.chapter04_Factory.Pizza.Pizza;
import jihong.chapter04_Factory.SimplePizzaFactory.SimplePizzaFactory;

public abstract class PizzaStore {

    public Pizza orderPizza(String type){
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.box();

        return pizza;
    }
    abstract Pizza createPizza(String type);

}
