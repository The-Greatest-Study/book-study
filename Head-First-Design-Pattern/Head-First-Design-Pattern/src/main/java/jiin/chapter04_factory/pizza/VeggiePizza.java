package jiin.chapter04_factory.pizza;

import jiin.chapter04_factory.pizzaStore.PizzaIngredientFactory;

public class VeggiePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        name = ingredientFactory.getPizzaStyle() + " 야채 피자";
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        vegitable = ingredientFactory.createVeggies();
    }
}
