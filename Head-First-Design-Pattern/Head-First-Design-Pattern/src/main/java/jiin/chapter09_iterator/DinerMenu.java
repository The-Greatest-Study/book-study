package jiin.chapter09_iterator;

import java.util.Iterator;
import lombok.Getter;

public class DinerMenu implements Menu {
    private static final MenuItem VEGETARIAN_BLT =
            new MenuItem("채식주의자용 BLT", "통밀 위에 콩고기 베이컨, 상추, 토마토를 얹은 메뉴", true, 2.99);
    private static final MenuItem BLT =
            new MenuItem("BLT", "통밀 위에 베이컨, 상추, 토마토를 얹은 메뉴", false, 2.99);
    private static final MenuItem SOUP_OF_TODAY =
            new MenuItem("오늘의 스프", "감자 샐러드를 곁들인 오늘의 스프", false, 3.29);
    private static final MenuItem HOT_DOG =
            new MenuItem("핫도그", "사워크라우트, 갖은 양념, 양파, 치즈가 곁들여진 핫도그", false, 3.05);
    public static final int MAX_ITEMS = 6;

    private int numberOfItems = 0;
    @Getter private MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addMenuItem(VEGETARIAN_BLT);
        addMenuItem(BLT);
        addMenuItem(SOUP_OF_TODAY);
        addMenuItem(HOT_DOG);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        addMenuItem(menuItem);
    }

    public void addMenuItem(MenuItem menuItem) {
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("죄송합니다, 메뉴가 꽉 찼습니다. 더 이상 추가할 수 없습니다.");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems += 1;
        }
    }

    public IteratorForMenuItem createIteratorForMenuItem() {
        return new DinerMenuIteratorForMenuItem(menuItems);
    }

    public Iterator<MenuItem> createIterator() {
        return new AlternatingDinerMenuIterator(menuItems);
    }
}
