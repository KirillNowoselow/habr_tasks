package tasks;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Task_7_0 {
    public static void main(String[] args) {
        frequencyDictionary("puriruri puriruri puriruri pariram YF yf aa");
    }
    public static void frequencyDictionary(String text){
       // Map<String, Integer> frequencyMap = new HashMap<>();
        TreeMap<String, Integer> frequencyMap = new TreeMap<>();
        for (String word : text.toLowerCase().split(" ")) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> item : frequencyMap.entrySet()) {
            System.out.println(item.toString());
        }
    }
}
