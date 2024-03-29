package tasks;

import java.util.HashMap;
import java.util.Map;

public class Task_7_7 {
    public static <K> void main(String[] args) {
        Integer[] array = new Integer[]{1,4,5,6,7,7};
        System.out.println(arrayToMap(array));
    }
    public static <K>Map<K, Integer> arrayToMap(K[] array){
        Map<K, Integer> map = new HashMap<>();
        for (K k : array){
            map.put(k, map.getOrDefault(k, 0)+1);
        }
        return map;
    }
}
