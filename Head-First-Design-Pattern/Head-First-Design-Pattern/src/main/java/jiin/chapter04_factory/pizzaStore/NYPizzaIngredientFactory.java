package jiin.chapter04_factory.pizzaStore;

import jiin.chapter04_factory.pizza.pizzaIngredient.cheese.Cheese;
import jiin.chapter04_factory.pizza.pizzaIngredient.cheese.ReggianoCheese;
import jiin.chapter04_factory.pizza.pizzaIngredient.clams.Clams;
import jiin.chapter04_factory.pizza.pizzaIngredient.clams.FreshClams;
import jiin.chapter04_factory.pizza.pizzaIngredient.dough.Dough;
import jiin.chapter04_factory.pizza.pizzaIngredient.dough.ThinCrustDough;
import jiin.chapter04_factory.pizza.pizzaIngredient.pepperoni.Pepperoni;
import jiin.chapter04_factory.pizza.pizzaIngredient.pepperoni.SlicedPepperoni;
import jiin.chapter04_factory.pizza.pizzaIngredient.sauce.MarinaraSauce;
import jiin.chapter04_factory.pizza.pizzaIngredient.sauce.Sauce;
import jiin.chapter04_factory.pizza.pizzaIngredient.vegitable.Garlic;
import jiin.chapter04_factory.pizza.pizzaIngredient.vegitable.Mushroom;
import jiin.chapter04_factory.pizza.pizzaIngredient.vegitable.Onion;
import jiin.chapter04_factory.pizza.pizzaIngredient.vegitable.RedPepper;
import jiin.chapter04_factory.pizza.pizzaIngredient.vegitable.Vegitable;
import lombok.Getter;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Getter private String pizzaStyle = "뉴욕 스타일";

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Vegitable[] createVeggies() {
        Vegitable vegitable[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return vegitable;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
