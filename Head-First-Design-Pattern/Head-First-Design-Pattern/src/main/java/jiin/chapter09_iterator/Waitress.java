package jiin.chapter09_iterator;

import java.util.Iterator;

public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinerMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator<MenuItem> pancakeIteratorForMenuItem = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinerIteratorForMenuItem = dinerMenu.createIterator();

        System.out.println("MENU");
        System.out.println("-----");

        System.out.println("BREAKFAST MENU");
        printMenu(pancakeIteratorForMenuItem);

        System.out.println();

        System.out.println("LUNCH MENU");
        printMenu(dinerIteratorForMenuItem);
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.println(menuItem);
        }
    }
}
