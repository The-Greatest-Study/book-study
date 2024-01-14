package jihong.chapter09_Composite;

import java.util.HashMap;
import java.util.Map;
import lombok.Getter;

@Getter
public class CafeMenu {
    Map<String, MenuItem> menuItems = new HashMap<String, MenuItem>();

    public CafeMenu() {
        addItem("베지버거", "통밀빵", true, 3.99);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(name, menuItem);
    }

    public Iterator createIterator() {
        return (Iterator) menuItems.values().iterator();
    }
}
