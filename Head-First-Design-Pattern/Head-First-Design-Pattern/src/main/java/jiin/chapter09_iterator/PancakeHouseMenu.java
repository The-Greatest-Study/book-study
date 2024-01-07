package jiin.chapter09_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lombok.Getter;

public class PancakeHouseMenu implements Menu {
    private static final MenuItem KNB_PANCAKE_SET =
            new MenuItem("K&B 팬케이크 세트", "스크램블 에그와 토스트가 곁들여진 팬케이크", true, 2.99);
    private static final MenuItem REGULAR_PANCAKE_SET =
            new MenuItem("레귤러 팬케이크 세트", "달걀 프라이와 소시지가 곁들여진 팬케이크", false, 2.99);
    private static final MenuItem BLUEBERRY_PANCAKE =
            new MenuItem("블루베리 팬케이크", "신선한 블루베리와 블루베리 시럽으로 만든 팬케이크", true, 3.49);
    private static final MenuItem WAFFLE =
            new MenuItem("와플", "취향에 따라 블루베리나 딸기를 얹을 수 있는 와플", true, 3.59);

    @Getter List<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();

        menuItems.add(KNB_PANCAKE_SET);
        menuItems.add(REGULAR_PANCAKE_SET);
        menuItems.add(BLUEBERRY_PANCAKE);
        menuItems.add(WAFFLE);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        menuItems.add(new MenuItem(name, description, vegetarian, price));
    }

    public void addMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    public IteratorForMenuItem createIteratorForMenuItem() {
        return new PancakeHouseIteratorForMenuItem(menuItems);
    }

    public Iterator<MenuItem> createIterator() {
        return menuItems.iterator();
    }
}
