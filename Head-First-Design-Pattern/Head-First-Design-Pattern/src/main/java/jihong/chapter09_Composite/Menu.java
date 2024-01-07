package jihong.chapter09_Composite;


import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
@AllArgsConstructor
@Getter
public class Menu extends MenuComponent{

    List<MenuComponent> menuComponents = new ArrayList<>();
    String name;
    String description;

    public Menu(String name, String description){
        this.name = name;
        this.description = description;

    }

    public void add(MenuComponent menuComponent){
        menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent){
        menuComponents.remove(menuComponent);
    }

    public MenuComponent getChild(int i){
        return menuComponents.get(i);
    }

    public void print(){
        System.out.println("\n" + getName() + "\n" + getDescription()+ "----");

        menuComponents.forEach(MenuComponent::print);
    }


}
