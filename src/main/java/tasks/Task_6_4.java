package tasks;

import java.util.Arrays;
import java.util.function.Function;

public class Task_6_4 {
    public static void main(String[] args) {
        Integer[] squares = new Integer[10];
        fill(squares, integer -> integer * integer);
        System.out.println(Arrays.toString(squares));
    }
    public static <T> void fill(T[] objects, Function<Integer, ? extends T> function) {
        for(int i = 0; i < objects.length; i++){
            objects[i] = function.apply(i);
        }
    }
}
