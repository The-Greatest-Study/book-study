package jiin.chapter09_composite;

public class MenuTestDrive {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("팬케이크 하우스 메뉴", "아침 메뉴");
        MenuComponent dinerMenu = new Menu("객체마을 식당 메뉴", "점심 메뉴");
        MenuComponent cafeMenu = new Menu("카페 메뉴", "저녁 메뉴");
        MenuComponent dessertMenu = new Menu("디저트 메뉴", "디저트를 즐겨 보세요!");

        MenuUtility.PancakeHouseMenu.addAllPancakeHouseMenu(pancakeHouseMenu);
        MenuUtility.DinerMenu.addAllDinerMenu(dinerMenu);
        MenuUtility.CafeMenu.addAllCafeMenu(cafeMenu);
        MenuUtility.DessertMenu.addAllDesertMenu(dessertMenu);

        MenuComponent allMenus = new Menu("전체 메뉴", "전체 메뉴");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        dinerMenu.add(dessertMenu);

        Waitress waitress = new Waitress(allMenus);

        waitress.printMenu();
    }
}
