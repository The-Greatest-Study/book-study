package jiin.chapter04_factory.onMyOwn;

public class NYPizzaStore implements PizzaStore {
    @Override
    public Pizza createPizza(String pizzaMenu) {
        Pizza pizza = new Pizza("New York style", pizzaMenu);

        preparePizza(pizza);
        bake(pizza);
        cut(pizza);
        box(pizza);

        return pizza;
    }

    @Override
    public void preparePizza(Pizza pizza) {
        System.out.println("\nPreparing : " + pizza.fullPizzaName());
        System.out.println("  - dough : " + pizza.getDough());
        System.out.println("  - sauce : " + pizza.getSauce());
        System.out.println("  - cheese : " + pizza.getCheese());
        switch (pizza.getName()) {
            case "veggie":
                System.out.println("  - veggies : " + String.join(", ", pizza.getVeggies()));
                break;
            case "clam":
                System.out.println("  - veggies : " + String.join(", ", pizza.getVeggies()));
                System.out.println("  - clams : " + pizza.getClam());
                break;
            case "pepperoni":
                System.out.println("  - veggies : " + String.join(", ", pizza.getVeggies()));
                System.out.println("  - pepperoni : " + pizza.getPepperoni());
                break;
        }
    }
    ;

    @Override
    public void bake(Pizza pizza) {
        System.out.println("Baking : " + pizza.fullPizzaName());
    }
    ;

    @Override
    public void cut(Pizza pizza) {
        System.out.println("Cutting : " + pizza.fullPizzaName());
    }
    ;

    @Override
    public void box(Pizza pizza) {
        System.out.println("Wrapping : " + pizza.fullPizzaName());
    }
    ;
}
