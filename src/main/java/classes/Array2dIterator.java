package classes;


import java.util.Iterator;
import java.util.NoSuchElementException;

public class Array2dIterator<T> implements Iterator<T> {
    private T[][] array;
    private int row;
    private int col;

    public Array2dIterator(T[][] array) {
        this.array = array;
        this.row = 0;
        this.col = 0;
    }

    @Override
    public boolean hasNext() {
        return row < array.length && col < array[row].length;
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T element = array[row][col];
        col++;
        if (col >= array[row].length) {
            col = 0;
            row++;
        }
        return element;
    }
}