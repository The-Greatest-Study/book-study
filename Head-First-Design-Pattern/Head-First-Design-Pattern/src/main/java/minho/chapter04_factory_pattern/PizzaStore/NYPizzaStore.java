package minho.chapter04_factory_pattern.PizzaStore;

import minho.chapter04_factory_pattern.Ingredients.Factory.IngredientFactory;
import minho.chapter04_factory_pattern.Ingredients.Factory.NYPizzaIngredientFactory;
import minho.chapter04_factory_pattern.Pizza.*;

public class NYPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        IngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if(item.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("뉴욕 스타일 치즈 피자");
        }else if(item.equals("veggie")){
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("뉴욕 스타일 야채 피자");
        }else if(item.equals("Clams")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("뉴욕 스타일 조개 피자");
        }else if(item.equals("pepperoni")){
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("뉴욕 스타일 페퍼로니 피자");
        }
        return pizza;
    }
}
