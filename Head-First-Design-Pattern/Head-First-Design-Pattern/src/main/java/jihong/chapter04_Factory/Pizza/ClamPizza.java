package jihong.chapter04_Factory.Pizza;

import jihong.chapter04_Factory.Pizza.Ingredient.PizzaIngredientFactory;
import jihong.chapter04_Factory.Pizza.Pizza;

public class ClamPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory){
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
