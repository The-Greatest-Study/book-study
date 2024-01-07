package minho.chapter09_collection_management;

import minho.chapter09_collection_management.menu.CafeMenu;
import minho.chapter09_collection_management.menu.DinerMenu;
import minho.chapter09_collection_management.menu.PancakeHouseMenu;

import java.util.Arrays;

public class MenuTestDrive {

    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();

        Waitress waitress = Waitress.from(Arrays.asList(pancakeHouseMenu, dinerMenu, cafeMenu));
        waitress.printMenu();

    }

}
