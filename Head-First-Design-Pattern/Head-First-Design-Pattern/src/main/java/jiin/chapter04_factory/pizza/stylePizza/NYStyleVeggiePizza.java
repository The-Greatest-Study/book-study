package jiin.chapter04_factory.pizza.stylePizza;

import jiin.chapter04_factory.pizza.Pizza;

public class NYStyleVeggiePizza extends Pizza {
    public NYStyleVeggiePizza() {
        name = "NY Style Veggie Pizza";
        //        dough = "Thin Crust Dough";
        //        sauce = "Marinara Sauce";
        //        toppings.add("Grated Reggiano Cheese");
        //        toppings.add("Garlic");
        //        toppings.add("Onion");
        //        toppings.add("Mushrooms");
        //        toppings.add("Red Pepper");
    }

    @Override
    public void prepare() {}
}
