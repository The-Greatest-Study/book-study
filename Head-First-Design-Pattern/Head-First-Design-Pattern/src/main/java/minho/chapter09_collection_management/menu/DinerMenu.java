package minho.chapter09_collection_management.menu;

import java.util.Iterator;

public class DinerMenu implements Menu {

    private static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;

    /*
     * final은 해당 entity가 오로지 한 번 할당될 수 있음을 의미합니다.
     *      - final의 정의가 ‘상수이다’가 아니라 ‘한 번만 초기화 가능하다’
     *      - 그러므로 final 멤버 변수가 반드시 상수는 아닙니다.
     */
    private final MenuItem[] menuItems = new MenuItem[MAX_ITEMS];

    public DinerMenu() {

        addMenu("채식주의자용 BLT", "통밀 위에 콩고기 베이컨, 상추, 토마토를 얹은 메뉴", true, 2.99);

        addMenu("BLT", "통밀 위에 베이컨, 상추, 토마토를 얹은 메뉴", false, 2.99);

        addMenu("오늘의 스프", "감자샐러드를 곁들인 오늘의 스프", false, 3.29);

        addMenu("핫도그", "사워크라우트, 갖은 양념, 양파, 치즈가 곁들여진 핫도그", false, 3.05);
    }

    public void addMenu(String name, String description, boolean vegetarian, double price) {

        if (isMaxItems()) {
            System.err.println("죄송합니다, 메뉴가 꽉 찼습니다. 더 이상 추가할 수 없습니다.");
        }

        menuItems[numberOfItems] =
                MenuItem.builder()
                        .name(name)
                        .description(description)
                        .vegetarian(vegetarian)
                        .price(price)
                        .build();

        numberOfItems += 1;
    }

    private boolean isMaxItems() {
        return numberOfItems >= MAX_ITEMS;
    }

    public Iterator createIterator() {
        return new DinnerMenuIterator(menuItems);
    }
}
