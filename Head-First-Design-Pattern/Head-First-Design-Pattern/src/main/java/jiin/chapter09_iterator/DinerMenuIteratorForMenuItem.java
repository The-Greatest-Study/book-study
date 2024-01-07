package jiin.chapter09_iterator;

public class DinerMenuIteratorForMenuItem implements IteratorForMenuItem {
    private MenuItem[] items;
    private int position = 0;

    public DinerMenuIteratorForMenuItem(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.length && items[position] != null;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = items[position];
        position += 1;
        return menuItem;
    }
}
