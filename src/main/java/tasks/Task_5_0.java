package tasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task_5_0 {
    public static void main(String[] args) {
        frequencyDictionary("puriruri pariram");
    }
    public static void frequencyDictionary(String text){

        Map<Character, Integer> frequencyMap = new HashMap<>();
        text = text.toLowerCase().replaceAll("[^а-яa-z]", "");

        for (char c : text.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> item : frequencyMap.entrySet()) {
            System.out.println(item.getKey() + ": " + item.getValue());
        }
    }
}
