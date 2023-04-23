package jihong.chapter04_Factory.Pizza;

import jihong.chapter04_Factory.Pizza.Ingredient.PizzaIngredientFactory;

public class CheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }
    @Override
    public void prepare() {
        System.out.println("준비 중: " + this.getName());
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();

    }
}
