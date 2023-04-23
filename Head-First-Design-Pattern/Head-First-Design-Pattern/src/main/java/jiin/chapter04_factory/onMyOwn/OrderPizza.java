package jiin.chapter04_factory.onMyOwn;

public class OrderPizza {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza cheesePizza = nyPizzaStore.createPizza("cheese");
        Pizza clamPizza = nyPizzaStore.createPizza("clam");
    }
}
