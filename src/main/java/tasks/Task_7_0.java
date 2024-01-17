package tasks;

import java.util.HashMap;
import java.util.Map;

public class Task_7_0 {
    public static void main(String[] args) {
        frequencyDictionary("puriruri pariram YF yf");
    }
    public static void frequencyDictionary(String text){
        String[] words = text.toLowerCase().split(" ");
        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> item : frequencyMap.entrySet()) {
            System.out.println(item.getKey() + ": " + item.getValue());
        }
    }
}
