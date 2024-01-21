package classes.Task_6_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayFilter {
    public static void main(String[] args) {
        String[] strings = {"Навальный", "[вырезано цензурой]", "банан"};
        Filter filter = new Filter() {
            @Override
            public boolean apply(Object o) {
                String s = (String) o;
                return s.contains("Навальный");
            }
        };
        String[] filteredStrings = ArrayFilter.filter(strings, filter);
        System.out.println(Arrays.toString(filteredStrings));
    }
    public static <T> T[] filter(T[] array, Filter filter) {
        List<T> filteredList = new ArrayList<>();
        for (T element : array) {
            if (filter.apply(element)) {
                filteredList.add(element);
            }
        }
        return filteredList.toArray(Arrays.copyOf(array, filteredList.size()));
    }
}