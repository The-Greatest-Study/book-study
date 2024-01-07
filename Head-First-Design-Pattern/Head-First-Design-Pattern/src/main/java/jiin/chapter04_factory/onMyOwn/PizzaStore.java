package jiin.chapter04_factory.onMyOwn;

public interface PizzaStore {
    Pizza createPizza(String pizzaMenu);

    void preparePizza(Pizza pizza);

    void bake(Pizza pizza);

    void cut(Pizza pizza);

    void box(Pizza pizza);
}
