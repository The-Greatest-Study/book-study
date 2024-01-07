package minho.chapter09_collection_management.menu_with_composite;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent {

    private final List<MenuComponent> menuComponents = new ArrayList<>();
    private String name;
    private String description;

    private Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public static Menu of(String name, String description) {
        return new Menu(name, description);
    }

    public void add(MenuComponent menuComponent){
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("-----------------------");

        for (MenuComponent menuComponent : menuComponents) {
            menuComponent.print();
        }
    }

}
