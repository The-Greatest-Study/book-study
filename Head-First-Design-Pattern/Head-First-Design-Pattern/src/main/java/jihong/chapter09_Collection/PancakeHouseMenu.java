package jihong.chapter09_Collection;

import java.util.ArrayList;
import java.util.List;

public class PancakeHouseMenu {
    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu(){
        menuItems = new ArrayList<MenuItem>();

    }

    public void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public ArrayList<MenuItem> getMenuItems(){
        return menuItems;
    }

    public Iterator createIterator(){
        return (Iterator)menuItems.iterator();
    }



}
