package jiin.chapter09_composite;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

public class Menu extends MenuComponent {
    private List<MenuComponent> menuComponentList = new ArrayList<>();
    @Getter private String name;
    @Getter private String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponentList.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponentList.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponentList.get(i);
    }

    @Override
    public void print() {
        System.out.println();

        System.out.print(name);
        System.out.print(", ");
        System.out.println(description);

        System.out.println("------------------------------");
        for (MenuComponent menuComponent : menuComponentList) {
            menuComponent.print();
        }
    }
}
