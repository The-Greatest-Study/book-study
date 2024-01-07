package jiin.chapter04_factory.pizzaStore;

import jiin.chapter04_factory.pizza.pizzaIngredient.cheese.Cheese;
import jiin.chapter04_factory.pizza.pizzaIngredient.clams.Clams;
import jiin.chapter04_factory.pizza.pizzaIngredient.dough.Dough;
import jiin.chapter04_factory.pizza.pizzaIngredient.pepperoni.Pepperoni;
import jiin.chapter04_factory.pizza.pizzaIngredient.sauce.Sauce;
import jiin.chapter04_factory.pizza.pizzaIngredient.vegitable.Vegitable;

public interface PizzaIngredientFactory {
    public String getPizzaStyle();

    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Vegitable[] createVeggies();

    public Pepperoni createPepperoni();

    public Clams createClam();
}
