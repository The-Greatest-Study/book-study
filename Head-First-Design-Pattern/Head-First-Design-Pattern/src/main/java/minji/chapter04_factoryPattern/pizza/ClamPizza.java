package minji.chapter04_factoryPattern.pizza;

import minji.chapter04_factoryPattern.ingredientFactory.PizzaIngredientFactory;

public class ClamPizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        this.name = "조개 피자";
    }

    @Override
    public void prepare() {
        System.out.println(name + " 준비 중...");
        dough = ingredientFactory.getDough();
        sauce = ingredientFactory.getSauce();
        cheese = ingredientFactory.getCheese();
        clams = ingredientFactory.getClams();
    }
}
