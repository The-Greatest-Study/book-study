package minji.chapter04_factoryPattern.pizza;

import minji.chapter04_factoryPattern.ingredientFactory.PizzaIngredientFactory;

public class VeggiePizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        this.name = "야채 피자";
    }

    @Override
    public void prepare() {
        System.out.println(name + " 준비 중...");
        dough = ingredientFactory.getDough();
        sauce = ingredientFactory.getSauce();
        cheese = ingredientFactory.getCheese();
        veggies = ingredientFactory.getVeggies();
    }
}
