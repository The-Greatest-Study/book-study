package minho.chapter09_collection_management.menu;

import java.util.List;

public class PancakeHouseMenuIterator implements Iterator {

    private final List<MenuItem> items;
    private int position = 0;

    public PancakeHouseMenuIterator(List<MenuItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position >= 0 && position < items.size();
    }

    @Override
    public MenuItem next() {
        return items.get(position++);
    }
}
