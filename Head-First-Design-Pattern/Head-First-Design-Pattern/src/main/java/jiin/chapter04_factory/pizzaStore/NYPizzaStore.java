package jiin.chapter04_factory.pizzaStore;

import jiin.chapter04_factory.pizza.CheesePizza;
import jiin.chapter04_factory.pizza.ClamPizza;
import jiin.chapter04_factory.pizza.PepperoniPizza;
import jiin.chapter04_factory.pizza.VeggiePizza;
import jiin.chapter04_factory.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        switch (type) {
            case "cheese":
                return new CheesePizza(ingredientFactory);
            case "veggie":
                return new VeggiePizza(ingredientFactory);
            case "clam":
                return new ClamPizza(ingredientFactory);
            case "pepperoni":
                return new PepperoniPizza(ingredientFactory);
            default:
                return null;
        }
    }
}
