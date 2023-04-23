package minji.chapter04_factoryPattern.pizza;

import minji.chapter04_factoryPattern.ingredientFactory.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza{
    PizzaIngredientFactory ingredientFactory;

    public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        this.name = "페퍼로니 피자";
    }

    @Override
    public void prepare() {
        System.out.println(name + " 준비 중...");
        dough = ingredientFactory.getDough();
        sauce = ingredientFactory.getSauce();
        cheese = ingredientFactory.getCheese();
        pepperoni = ingredientFactory.getPepperoni();

    }
}
