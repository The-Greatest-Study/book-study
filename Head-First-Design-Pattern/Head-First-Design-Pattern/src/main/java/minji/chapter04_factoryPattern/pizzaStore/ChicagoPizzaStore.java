package minji.chapter04_factoryPattern.pizzaStore;

import minji.chapter04_factoryPattern.ingredientFactory.ChicagoPizzaIngredientFactory;
import minji.chapter04_factoryPattern.ingredientFactory.PizzaIngredientFactory;
import minji.chapter04_factoryPattern.pizza.*;

public class ChicagoPizzaStore extends PizzaStore{

    PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new CheesePizza(ingredientFactory);
        } else if (type.equals("clam")){
            return new ClamPizza(ingredientFactory);
        } else if (type.equals("veggie")) {
            return new VeggiePizza(ingredientFactory);
        } else if (type.equals("pepperoni")) {
            return new PepperoniPizza(ingredientFactory);
        } else {
            return null;
        }
    }
}
