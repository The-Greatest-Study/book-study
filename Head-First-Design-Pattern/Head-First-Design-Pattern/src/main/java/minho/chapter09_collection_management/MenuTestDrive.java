package minho.chapter09_collection_management;

import minho.chapter09_collection_management.menu.DinerMenu;
import minho.chapter09_collection_management.menu.PancakeHouseMenu;

public class MenuTestDrive {

    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        Waitress waitress = Waitress.of(pancakeHouseMenu, dinerMenu);
        waitress.printMenu();

    }

}
