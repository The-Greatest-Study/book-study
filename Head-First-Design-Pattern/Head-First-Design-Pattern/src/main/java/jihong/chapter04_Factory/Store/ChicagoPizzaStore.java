package jihong.chapter04_Factory.Store;

import jihong.chapter04_Factory.Pizza.ChicagoPizza.ChicagoStyleChessePizza;
import jihong.chapter04_Factory.Pizza.ChicagoPizza.ChicagoStyleClamPizza;
import jihong.chapter04_Factory.Pizza.ChicagoPizza.ChicagoStyleVeggiePizza;
import jihong.chapter04_Factory.Pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {

        if ("cheese".equals(type)) {
            return new ChicagoStyleChessePizza();
        } else if ("clam".equals(type)) {
            return new ChicagoStyleClamPizza();
        } else if ("veggie".equals(type)) {
            return new ChicagoStyleVeggiePizza();
        } else if ("pepperoni".equals(type)) {
            return null;
        }
        return null;
    }
}