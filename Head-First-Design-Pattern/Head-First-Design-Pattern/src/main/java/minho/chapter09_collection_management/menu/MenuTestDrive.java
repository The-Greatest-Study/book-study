package minho.chapter09_collection_management.menu;

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
