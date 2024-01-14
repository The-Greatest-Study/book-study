package minji.chapter09_iteratorPattern;

import java.util.Iterator;

public interface Menu {
    public Iterator<MenuItem> createIterator();
}
