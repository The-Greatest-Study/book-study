package jihong.chapter04_Factory.Store;

import jihong.chapter04_Factory.Pizza.NYPizza.NYStyleChessePizza;
import jihong.chapter04_Factory.Pizza.NYPizza.NYStyleClamPizza;
import jihong.chapter04_Factory.Pizza.NYPizza.NYStyleVeggiePizza;
import jihong.chapter04_Factory.Pizza.Pizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {

        if ("cheese".equals(type)) {
            return new NYStyleChessePizza();
        } else if ("clam".equals(type)) {
            return new NYStyleClamPizza();
        } else if ("veggie".equals(type)) {
            return new NYStyleVeggiePizza();
        } else if ("pepperoni".equals(type)) {
            return null;
        }
        return null;
    }
}