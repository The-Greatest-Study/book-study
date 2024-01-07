package jihong.chapter04_Factory.SimplePizzaFactory;

import jihong.chapter04_Factory.Pizza.Pizza;

public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        //
        //        if("cheese".equals(type)){
        //            pizza = new CheesePizza();
        //        }else if("pepperoni".equals(type)){
        //            pizza = new PepperoniPizza();
        //        }else if("veggie".equals(type)){
        //            pizza = new VeggiePizza();
        //        }

        return pizza;
    }
}
