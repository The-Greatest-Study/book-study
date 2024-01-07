package minho.chapter09_collection_management;

import minho.chapter09_collection_management.menu.DinerMenu;
import minho.chapter09_collection_management.menu.Iterator;
import minho.chapter09_collection_management.menu.MenuItem;
import minho.chapter09_collection_management.menu.PancakeHouseMenu;

public class Waitress {

    PancakeHouseMenu pancakeHouseMenu;
    DinerMenu dinerMenu;

    // 생성자를 private화 하여 외부에서 생성자 호출 차단
    private Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public static Waitress of(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu){
        return new Waitress(pancakeHouseMenu, dinerMenu);
    }

    public void printMenu() {
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinnerIterator = dinerMenu.createIterator();

        System.out.print("메뉴\n----\n아침 메뉴\n");
        printMenu(pancakeIterator);

        System.out.print("\n점심 메뉴\n");
        printMenu(dinnerIterator);
    }

    // 오버로드된 printMenu 메소드 활용
    private void printMenu(Iterator iterator){
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            menuItem.printMenu();
        }
    }

}
