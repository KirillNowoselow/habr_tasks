package tasks;

import java.util.*;

public class Task_7_8 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 1);
        System.out.println(swapKeysAndValues(map));
    }
    public static <K, V> Map <V, Collection<K>> swapKeysAndValues(Map<K,V> map){
        Map<V, Collection<K>> resultMap = new HashMap<>();
        for (Map.Entry<K, V> item: map.entrySet()){
            V value = item.getValue();
            Collection<K> keys = resultMap.getOrDefault(value, new ArrayList<>());
            keys.add(item.getKey());
            resultMap.put(value, keys);
        }
        return resultMap;
    }
//    public static <K, V> Map <V, Collection<K>> swapKeysAndValues(Map<K,V> map){
//        Map<V, Collection<K>> resultMap = new HashMap<>();
//        Set<K> keys = map.keySet();
//        for (K key : keys){
//            V value = map.get(key);
//            resultMap.compute(value, (v, ks) -> {
//                if (ks == null) {
//                    ks = new HashSet<>();
//                }
//                ks.add(key);
//                return ks;
//            });
//        }
//        return resultMap;
//    }
}
