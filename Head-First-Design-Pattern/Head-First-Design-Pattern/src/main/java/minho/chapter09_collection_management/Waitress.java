package minho.chapter09_collection_management;

import minho.chapter09_collection_management.menu.*;
import java.util.Iterator;

public class Waitress {

    Menu pancakeHouseMenu;
    Menu dinerMenu;

    // 생성자를 private화 하여 외부에서 생성자 호출 차단
    private Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public static Waitress of(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu){
        return new Waitress((Menu) pancakeHouseMenu, (Menu)dinerMenu);
    }

    public void printMenu() {
        Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinnerIterator = dinerMenu.createIterator();

        System.out.print("메뉴\n----\n아침 메뉴\n");
        printMenu(pancakeIterator);

        System.out.print("\n점심 메뉴\n");
        printMenu(dinnerIterator);
    }

    // 오버로드된 printMenu 메소드 활용
    private void printMenu(Iterator iterator){
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            menuItem.printMenu();
        }
    }

}
