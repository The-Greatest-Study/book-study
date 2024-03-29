package minho.chapter09_collection_management.menu;

import java.util.Iterator;
import java.util.List;

public class Waitress {

    //    Menu pancakeHouseMenu;
    //    Menu dinerMenu;
    //    CafeMenu cafeMenu;
    //
    //    // 생성자를 private화 하여 외부에서 생성자 호출 차단
    //    private Waitress(Menu pancakeHouseMenu, Menu dinerMenu, CafeMenu cafeMenu) {
    //        this.pancakeHouseMenu = pancakeHouseMenu;
    //        this.dinerMenu = dinerMenu;
    //        this.cafeMenu = cafeMenu;
    //    }
    //
    //    public static Waitress of(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu, CafeMenu
    // cafeMenu){
    //        return new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);
    //    }

    private List<Menu> menus;

    private Waitress(List<Menu> menus) {
        this.menus = menus;
    }

    public static Waitress from(List<Menu> menus) {
        return new Waitress(menus);
    }

    public void printMenu() {
        //        Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
        //        Iterator<MenuItem> dinnerIterator = dinerMenu.createIterator();
        //        Iterator<MenuItem> cafeIterator = cafeMenu.createIterator();
        //
        //        System.out.print("메뉴\n----\n아침 메뉴\n");
        //        printMenu(pancakeIterator);
        //
        //        System.out.print("\n점심 메뉴\n");
        //        printMenu(dinnerIterator);
        //
        //        System.out.print("\n저녁 메뉴\n");
        //        printMenu(cafeIterator);

        for (Menu menu : menus) {
            printMenu(menu.createIterator());
            System.out.println();
        }
    }

    // 오버로드된 printMenu 메소드 활용
    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            menuItem.printMenu();
        }
    }
}
