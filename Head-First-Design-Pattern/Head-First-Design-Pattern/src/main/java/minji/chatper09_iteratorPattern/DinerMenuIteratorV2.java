package minji.chatper09_iteratorPattern;

import java.util.Iterator;

public class DinerMenuIteratorV2 implements Iterator<MenuItem>{
    MenuItem[] items;
    int position = 0;

    public DinerMenuIteratorV2(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = items[position];
        position += 1;
        return menuItem;
    }

    public void remove() {
        throw new UnsupportedOperationException("메뉴 항목은 지우면 안 됩니다");
    }
}
