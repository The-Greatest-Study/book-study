package minho.chapter09_collection_management.menu;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CafeMenu implements Menu {

    private final Map<String, MenuItem> menuItems = new HashMap<>();

    public CafeMenu() {

        addMenu("베지 버거와 에어프라이",
                "통밀빵, 상추, 토마토, 감자 튀김이 첨가된 베지 버거",
                true,
                3.99);

        addMenu("오늘의 스프",
                "샐러드가 곁들여진 오늘의 스프",
                false,
                3.69);

        addMenu("부리토",
                "통 핀토콩과 살사, 과카몰리가 곁들여진 푸짐한 부리토",
                false,
                4.29);

    }

    public void addMenu(String name, String description, boolean vegetarian, double price) {
        menuItems.put(name, MenuItem.builder()
                                    .name(name)
                                    .description(description)
                                    .vegetarian(vegetarian)
                                    .price(price)
                                    .build());
    }

//    public Map<String, MenuItem> getMenuItems() {
//        return menuItems;
//    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItems.values().iterator();
    }
}
