package tasks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Task_7_1 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>(List.of(1,5,1,5,7,9));
        System.out.println(removeDuplicates(integers));
    }
    public static <T>Collection<T> removeDuplicates(Collection<T> collection) {
        return new HashSet<>(collection);
    }
}
