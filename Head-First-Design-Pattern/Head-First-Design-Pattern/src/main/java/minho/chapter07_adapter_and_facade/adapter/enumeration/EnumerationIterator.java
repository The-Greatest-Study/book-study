package minho.chapter07_adapter_and_facade.adapter.enumeration;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIterator implements Iterator<Object> {

    private final Enumeration<?> enumeration;

    public EnumerationIterator(Enumeration<?> enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return this.enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return this.enumeration.nextElement();
    }

    @Override
    public void remove() {
        // Enumeration 미제공 기능
        throw new UnsupportedOperationException();
    }
}
