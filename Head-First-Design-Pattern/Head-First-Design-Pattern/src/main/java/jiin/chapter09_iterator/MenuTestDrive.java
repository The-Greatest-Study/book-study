package jiin.chapter09_iterator;

public class MenuTestDrive {
    public static void main(String[] args) {
        System.out.println("Customized Iterator For Menu Item Example");

        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        WaitressWithIteratorForMenuItem waitressWithIteratorForMenuItem =
                new WaitressWithIteratorForMenuItem(pancakeHouseMenu, dinerMenu);

        waitressWithIteratorForMenuItem.printMenu();

        System.out.println();
        System.out.println();
        System.out.println("JAVA Iterator Example");

        Menu breakfastPancakeHouseMenu = new PancakeHouseMenu();
        Menu lunchDinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(breakfastPancakeHouseMenu, lunchDinerMenu);
        waitress.printMenu();
    }
}
