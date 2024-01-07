package jiin.chapter09_iterator;

import java.util.List;

public class PancakeHouseIteratorForMenuItem implements IteratorForMenuItem {
    private List<MenuItem> items;
    private int index = 0;

    public PancakeHouseIteratorForMenuItem(List<MenuItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return index < items.size() && items.get(index) != null;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = items.get(index);
        index += 1;
        return menuItem;
    }
}
