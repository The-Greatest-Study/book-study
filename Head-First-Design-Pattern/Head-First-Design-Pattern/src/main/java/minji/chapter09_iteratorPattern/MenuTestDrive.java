package minji.chapter09_iteratorPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();
        List<Menu> menus = new ArrayList<>(Arrays.asList(pancakeHouseMenu, dinerMenu, cafeMenu));

        Waitress waitress = new Waitress(menus);

        waitress.printMenu();
    }
}
