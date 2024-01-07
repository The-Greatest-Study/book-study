package minji.chapter04_factoryPattern.pizza;

import minji.chapter04_factoryPattern.ingredientFactory.PizzaIngredientFactory;

public class CheesePizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        this.name = "치즈 피자";
    }

    @Override
    public void prepare() {
        System.out.println(name + " 준비 중...");
        dough = ingredientFactory.getDough();
        sauce = ingredientFactory.getSauce();
        cheese = ingredientFactory.getCheese();
    }
}
