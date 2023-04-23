package minho.chapter04_factory_pattern.Pizza;

import minho.chapter04_factory_pattern.Ingredients.Factory.IngredientFactory;

public class PepperoniPizza extends Pizza{
    IngredientFactory ingredientFactory;

    public PepperoniPizza(IngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("준비 중: " + this.name);
        this.dough = ingredientFactory.createDough();
        this.sauce = ingredientFactory.createSauce();
        this.cheese = ingredientFactory.createCheese();
        this.pepperoni = ingredientFactory.createPepperoni();
    }
}
