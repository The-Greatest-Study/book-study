package minho.chapter04_factory_pattern.Ingredients.Factory;

import minho.chapter04_factory_pattern.Ingredients.*;

public interface IngredientFactory {

    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Veggies[] createVeggies();

    public Pepperoni createPepperoni();

    public Clams createClams();
}
