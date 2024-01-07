package minji.chapter04_factoryPattern.ingredientFactory;

import minji.chapter04_factoryPattern.ingredients.*;

public interface PizzaIngredientFactory {

    public Dough getDough();

    public Sauce getSauce();

    public Cheese getCheese();

    public Clams getClams();

    public Veggies[] getVeggies();

    public Pepperoni getPepperoni();
}
