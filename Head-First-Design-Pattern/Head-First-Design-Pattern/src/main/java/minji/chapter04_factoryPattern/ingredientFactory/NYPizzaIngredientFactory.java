package minji.chapter04_factoryPattern.ingredientFactory;

import minji.chapter04_factoryPattern.ingredients.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough getDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce getSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese getCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Clams getClams() {
        return new FreshClams();
    }

    @Override
    public Veggies[] getVeggies() {
        Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return veggies;
    }

    @Override
    public Pepperoni getPepperoni() {
        return new SlicedPepperoni();
    }
}
