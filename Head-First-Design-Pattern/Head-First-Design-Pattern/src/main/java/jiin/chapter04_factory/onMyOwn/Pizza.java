package jiin.chapter04_factory.onMyOwn;

import lombok.Getter;

@Getter
public class  Pizza {
    private String name;
    private String style;
    private String dough;
    private String sauce;
    private String cheese;
    private String[] veggies;
    private String pepperoni;
    private String clam;

    public Pizza(String style, String pizzaMenu) {
        switch(style) {
            case "New York style" -> {
                this.style = style;
                this.name = pizzaMenu;
                this.dough = "thin crust dough";
                this.sauce = "marinara sauce";
                this.cheese = "reggiano cheese";
                this.veggies = new String[]{"garlic", "onion", "mushroom", "red pepper"};
                this.pepperoni = "sliced pepperoni";
                this.clam = "fresh clams";
            }
            case "Chicago Style" -> {
                this.style = style;
                this.name = pizzaMenu;
                this.dough = "thick crust dough";
                this.sauce = "plum tomato sauce";
                this.cheese = "mozzarella cheese";
                this.veggies = new String[]{"eggplant", "spinach", "garlic"};
                this.pepperoni = "sliced pepperoni";
                this.clam = "frozen clams";
            }
            default -> {
                this.style = "default";
                this.name = pizzaMenu;
                this.dough = "thin crust dough";
                this.sauce = "plum tomato sauce";
                this.cheese = "mozzarella cheese";
                this.veggies = new String[]{"garlic", "onion", "mushroom", "red pepper"};
                this.pepperoni = "sliced pepperoni";
                this.clam = "frozen clams";
            }
        };
    }

    public String fullPizzaName(){
        return style + " " + name + " pizza";
    }


}
