package jihong.chapter04_Factory.Store;

import jihong.chapter04_Factory.Pizza.CheesePizza;
import jihong.chapter04_Factory.Pizza.ClamPizza;
import jihong.chapter04_Factory.Pizza.Ingredient.PizzaIngredientFactory;
import jihong.chapter04_Factory.Pizza.NYPizza.NYPizzaIngredientFactory;
import jihong.chapter04_Factory.Pizza.Pizza;
import jihong.chapter04_Factory.Pizza.VeggiePizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if ("cheese".equals(type)) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("뉴욕 스타일 치즈 피자");
        } else if ("clam".equals(type)) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("뉴욕 스타일 조개 피자");
        } else if ("veggie".equals(type)) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("뉴욕 스타일 야채 피자");
        } else if ("pepperoni".equals(type)) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("뉴욕 스타일 페퍼로니 피자");
        }
        return pizza;
    }
}