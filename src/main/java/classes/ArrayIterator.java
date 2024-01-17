package classes;

import lombok.Data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

@Data
public class ArrayIterator<T> implements Iterator {
    private T[] array;
    private int index;
    @Override
    public boolean hasNext() {
        return index < array.length;
    }

    @Override
    public Object next() {
        if (!hasNext())
            throw new NoSuchElementException();
        return array[index++];
    }
}
