package minho.chapter04_factory_pattern.Pizza;

import minho.chapter04_factory_pattern.Ingredients.Factory.IngredientFactory;

public class CheesePizza extends Pizza{

    IngredientFactory ingredientFactory;

    public CheesePizza(IngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("준비 중: " + this.name);
        this.dough = ingredientFactory.createDough();
        this.sauce = ingredientFactory.createSauce();
        this.cheese = ingredientFactory.createCheese();
    }
}
