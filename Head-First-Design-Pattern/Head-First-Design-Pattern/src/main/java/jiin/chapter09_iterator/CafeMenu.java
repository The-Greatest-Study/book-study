package jiin.chapter09_iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import lombok.Getter;

public class CafeMenu implements Menu {
    private static final MenuItem VEGGIE_BURGER_AND_FRIES =
            new MenuItem("베지 버거와 에어 프라이", "통밀빵, 상추, 토마토, 감자 튀김이 첨가된 베지 버거", true, 3.99);
    private static final MenuItem SOUP_OF_TODAY =
            new MenuItem("오늘의 스프", "샐러드가 곁들여진 오늘의 스프", false, 3.69);
    private static final MenuItem BURRITO =
            new MenuItem("부리토", "통 핀토콩과 살사, 구아카몰이 곁들여진 푸짐한 부리토", true, 4.29);

    @Getter private Map<String, MenuItem> menuItems = new HashMap<>();

    public CafeMenu() {
        addItem(VEGGIE_BURGER_AND_FRIES);
        addItem(SOUP_OF_TODAY);
        addItem(BURRITO);
    }

    private void addItem(MenuItem menuItem) {
        menuItems.put(menuItem.getName(), menuItem);
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItems.values().iterator();
    }
}
