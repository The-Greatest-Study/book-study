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

        return switch(type){
            case "cheese" -> new CheesePizza(ingredientFactory);
            case "veggie" -> new VeggiePizza(ingredientFactory);
            case "clam" -> new ClamPizza(ingredientFactory);
            case "pepperoni" -> new PepperoniPizza(ingredientFactory);
            default -> null;
        };
    }
}
