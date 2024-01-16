package tasks;

import java.util.ArrayList;

public class Task_Strings {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>(4);
        strings.add("aaaaa");
        strings.add("aaaa");
        strings.add("aaa");
        strings.add("aaaaaaaaa");
        System.out.println(searchLongString(strings));
        System.out.println(isPolindrom("Палиндром"));
        System.out.println(replaceString("Навальный молодец."));
        System.out.println(countOfCccurrences("Навальный молодец.", "молодец"));
    }

    public static String searchLongString(ArrayList<String> strings){
        int indexLongString = 0;
        int maxLong = 0;
        for (int i = 0; i < strings.size(); i++) {
            int lengthString = strings.get(i).length();
            if(lengthString > maxLong){
                maxLong = lengthString;
                indexLongString = i;
            }
        }
        return strings.get(indexLongString);
    }

    public static String isPolindrom(String string){
        int length = string.length();
        for (int i = 0; i < (length/2); i++) {
            if(string.charAt(i) != string.charAt(length-i-1)){
                return "Слово "+string+" не полиндром";
            }
        }
        return "Слово "+string+" полиндром";
    }

    public static String replaceString(String string){
        return string.replace("Навальный", "[вырезано цензурой]");
    }

    public static int countOfCccurrences(String string, String key){
        int count = 0;
        if (string.indexOf(key)==-1){
            return count;
        }
        while(string.length()>=key.length()){
            int index = string.indexOf(key);
            if (index !=-1){
                count += 1;
                string = string.substring(index+1);
            }else {break;}
        }
        return count;
    }
}
