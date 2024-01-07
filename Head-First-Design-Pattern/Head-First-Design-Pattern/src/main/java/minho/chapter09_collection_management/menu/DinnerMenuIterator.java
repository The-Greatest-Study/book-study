package minho.chapter09_collection_management.menu;

import java.util.Iterator;

public class DinnerMenuIterator implements Iterator {

    private final MenuItem[] items;
    private int position = 0;

    public DinnerMenuIterator(MenuItem[] items){
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        /*
         * DinnerMenu는 MAX_ITEMS로 초기화 되어있어, 아래 두가지 조건 모두 검증해야 한다.
         *      - MAX_ITEMS 제한
         *      - 입력된 메뉴 수 제한
         */
        return !(position >= items.length || items[position] == null);
    }

    @Override
    public MenuItem next() {
        return items[position++];
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("메뉴 항목은 지우면 안 됩니다.");
    }
}
