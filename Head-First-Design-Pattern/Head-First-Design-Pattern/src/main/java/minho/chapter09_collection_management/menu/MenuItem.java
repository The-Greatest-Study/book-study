package minho.chapter09_collection_management.menu;

import lombok.Builder;
import lombok.Getter;

@Getter
public class MenuItem {

    private String name;
    private String description;
    private boolean vegetarian;
    private double price;

    @Builder
    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public void printMenu() {
        System.out.print(name + ", ");
        System.out.print(price + " -- ");
        System.out.println(description);
    }

}
