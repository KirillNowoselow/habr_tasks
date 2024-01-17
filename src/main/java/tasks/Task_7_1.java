package tasks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Task_7_1 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(5);
        integers.add(1);
        integers.add(5);
        integers.add(7);
        integers.add(9);
        System.out.println(removeDuplicates(integers));
    }
    public static <T>Collection<T> removeDuplicates(Collection<T> collection) {
        return new HashSet<>(collection);
    }
}
