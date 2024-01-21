package tasks;

import classes.TwoIterators;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Task_7_6 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);
        Iterator<Integer> iterator1 = list1.iterator();
        Iterator<Integer> iterator2 = list2.iterator();
        TwoIterators<Integer> iterator = new TwoIterators<>(iterator1, iterator2);

        while (iterator.hasNext()) {
            Integer element = iterator.next();
            System.out.print(element + " ");
        }
    }
}
