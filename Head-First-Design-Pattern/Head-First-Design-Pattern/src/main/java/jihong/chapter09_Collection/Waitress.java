package jihong.chapter09_Collection;

import java.awt.*;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinerMenu;

    public void printMenu() {
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();

        printMenu(pancakeIterator);
        printMenu(dinerIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.println(menuItem.getDescription());
        }
    }
}
