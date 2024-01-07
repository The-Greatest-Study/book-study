package minho.chapter09_collection_management.menu_with_composite;


public class MenuTestDrive {

    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = Menu.of("팬케이크 하우스 메뉴", "아침 메뉴");
        MenuComponent dinerMenu = Menu.of("객체마을 식당 메뉴", "점심 메뉴");
        MenuComponent cafeMenu = Menu.of("카페 메뉴", "저녁 메뉴");
        MenuComponent dessertMenu = Menu.of("디저트 메뉴", "디저트를 즐겨 보세요!");

        MenuComponent allMenus = Menu.of("전체 메뉴", "전체 메뉴");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        dinerMenu.add(MenuItem.builder()
                .name("파스타")
                .description("마리나라 소스 스파게티, 효모빵도 드립니다.")
                .vegetarian(true)
                .price(3.89)
                .build());

        dinerMenu.add(dessertMenu);

        dessertMenu.add(MenuItem.builder()
                .name("애플 파이")
                .description("바삭바삭한 크러스트에 바닐라 아이스크림이 얹혀 있는 애플 파이")
                .vegetarian(true)
                .price(1.59)
                .build());

        Waitress waitress = Waitress.from(allMenus);

        waitress.printMenu();

    }

}
