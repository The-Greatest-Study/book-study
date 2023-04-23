package jiin.chapter04_factory.pizza;

import jiin.chapter04_factory.pizzaStore.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        name = ingredientFactory.getPizzaStyle() + " 페퍼로니 피자";
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        vegitable = ingredientFactory.createVeggies();
        pepperoni = ingredientFactory.createPepperoni();
    }
}
