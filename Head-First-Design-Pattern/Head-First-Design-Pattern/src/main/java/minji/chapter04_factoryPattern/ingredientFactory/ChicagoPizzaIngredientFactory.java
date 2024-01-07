package minji.chapter04_factoryPattern.ingredientFactory;

import minji.chapter04_factoryPattern.ingredients.*;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough getDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce getSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese getCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Clams getClams() {
        return new FrozenClams();
    }

    @Override
    public Veggies[] getVeggies() {
        Veggies veggies[] = {new Spinach(), new BlackOlives(), new EggPlant()};
        return veggies;
    }

    @Override
    public Pepperoni getPepperoni() {
        return new SlicedPepperoni();
    }
}
