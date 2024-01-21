package classes;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class TwoIterators<T> implements Iterator<T> {
    private Iterator<T> iterator1;
    private Iterator<T> iterator2;

    public TwoIterators(Iterator<T> iterator1, Iterator<T> iterator2) {
        this.iterator1 = iterator1;
        this.iterator2 = iterator2;
    }

    @Override
    public boolean hasNext() {
        return iterator1.hasNext() || iterator2.hasNext();
    }

    @Override
    public T next() {
        if (iterator1.hasNext()) {
            return iterator1.next();
        } else if (iterator2.hasNext()) {
            return iterator2.next();
        } else {
            throw new NoSuchElementException();
        }
    }
}