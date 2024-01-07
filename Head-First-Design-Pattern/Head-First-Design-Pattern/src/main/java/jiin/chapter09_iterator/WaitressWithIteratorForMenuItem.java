package jiin.chapter09_iterator;

public class WaitressWithIteratorForMenuItem {
    PancakeHouseMenu pancakeHouseMenu;
    DinerMenu dinerMenu;

    public WaitressWithIteratorForMenuItem(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        IteratorForMenuItem pancakeIteratorForMenuItem =
                pancakeHouseMenu.createIteratorForMenuItem();
        IteratorForMenuItem dinerIteratorForMenuItem = dinerMenu.createIteratorForMenuItem();

        System.out.println("MENU");
        System.out.println("-----");

        System.out.println("BREAKFAST MENU");
        printMenu(pancakeIteratorForMenuItem);

        System.out.println();

        System.out.println("LUNCH MENU");
        printMenu(dinerIteratorForMenuItem);
    }

    private void printMenu(IteratorForMenuItem iteratorForMenuItem) {
        while (iteratorForMenuItem.hasNext()) {
            MenuItem menuItem = iteratorForMenuItem.next();
            System.out.println(menuItem);
        }
    }
}
