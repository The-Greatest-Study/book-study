package jihong.chapter04_Factory.Pizza;

import jihong.chapter04_Factory.Pizza.Ingredient.PizzaIngredientFactory;

public class VeggiePizza extends Pizza {
    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {}

    @Override
    public void prepare() {}
}
