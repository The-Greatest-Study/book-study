package jiin.chapter04_factory.pizza;

import jiin.chapter04_factory.pizza.pizzaIngredient.cheese.Cheese;
import jiin.chapter04_factory.pizza.pizzaIngredient.clams.Clams;
import jiin.chapter04_factory.pizza.pizzaIngredient.dough.Dough;
import jiin.chapter04_factory.pizza.pizzaIngredient.pepperoni.Pepperoni;
import jiin.chapter04_factory.pizza.pizzaIngredient.sauce.Sauce;
import jiin.chapter04_factory.pizza.pizzaIngredient.vegitable.Vegitable;
import lombok.Getter;
import lombok.Setter;

@Getter
public abstract class Pizza {
    @Setter protected String name;
    // Factory Method
    //    String dough;
    //    String sauce;
    //    List<String> toppings = new ArrayList<>();

    protected Dough dough;
    protected Sauce sauce;
    protected Vegitable vegitable[];
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clam;

    public abstract void prepare();

    public void bake() {
        System.out.println("Baking " + name);
    }

    public void cut() {
        System.out.println("Cutting " + name);
    }

    public void box() {
        System.out.println("Wrapping " + name);
    }
}
