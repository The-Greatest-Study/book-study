package jiin.chapter04_factory.pizzaStore;

import jiin.chapter04_factory.pizza.pizzaIngredient.cheese.Cheese;
import jiin.chapter04_factory.pizza.pizzaIngredient.cheese.MozzarellaCheese;
import jiin.chapter04_factory.pizza.pizzaIngredient.clams.Clams;
import jiin.chapter04_factory.pizza.pizzaIngredient.clams.FrozenClams;
import jiin.chapter04_factory.pizza.pizzaIngredient.dough.Dough;
import jiin.chapter04_factory.pizza.pizzaIngredient.dough.ThickCrustDough;
import jiin.chapter04_factory.pizza.pizzaIngredient.pepperoni.Pepperoni;
import jiin.chapter04_factory.pizza.pizzaIngredient.pepperoni.SlicedPepperoni;
import jiin.chapter04_factory.pizza.pizzaIngredient.sauce.PlumTomatoSauce;
import jiin.chapter04_factory.pizza.pizzaIngredient.sauce.Sauce;
import jiin.chapter04_factory.pizza.pizzaIngredient.vegitable.EggPlant;
import jiin.chapter04_factory.pizza.pizzaIngredient.vegitable.Garlic;
import jiin.chapter04_factory.pizza.pizzaIngredient.vegitable.Spinach;
import jiin.chapter04_factory.pizza.pizzaIngredient.vegitable.Vegitable;
import lombok.Getter;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Getter private String pizzaStyle = "시카고 스타일";

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Vegitable[] createVeggies() {
        Vegitable vegitable[] = {new EggPlant(), new Spinach(), new Garlic()};
        return vegitable;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
