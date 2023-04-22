package jihong.chapter04_Factory.Store;

import jihong.chapter04_Factory.Pizza.CalliforniaPizza.CalliforniaStyleChessePizza;
import jihong.chapter04_Factory.Pizza.CalliforniaPizza.CalliforniaStyleClamPizza;
import jihong.chapter04_Factory.Pizza.CalliforniaPizza.CalliforniaStyleVeggiePizza;
import jihong.chapter04_Factory.Pizza.NYPizza.NYStyleChessePizza;
import jihong.chapter04_Factory.Pizza.NYPizza.NYStyleClamPizza;
import jihong.chapter04_Factory.Pizza.NYPizza.NYStyleVeggiePizza;
import jihong.chapter04_Factory.Pizza.Pizza;

public class CaliforniaPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {

        if ("cheese".equals(type)) {
            return new CalliforniaStyleChessePizza();
        } else if ("clam".equals(type)) {
            return new CalliforniaStyleClamPizza();
        } else if ("veggie".equals(type)) {
            return new CalliforniaStyleVeggiePizza();
        } else if ("pepperoni".equals(type)) {
            return null;
        }
        return null;
    }
}