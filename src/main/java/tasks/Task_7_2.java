package tasks;

import java.util.ArrayList;
import java.util.LinkedList;

public class Task_7_2 {
    public static void main(String[] args) {
        ArrayList<Double> integersArr = new ArrayList<>();
        LinkedList<Double> integersLink = new LinkedList<>();
        int countElement = 1000000;
        for (int i = 0; i < countElement; i++) {
            integersArr.add(Math.random());
            integersLink.add(Math.random());
        }
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            integersArr.get((int) Math.random() * (countElement-1));
        }
        System.out.println("Время выполнения Array: "+(System.currentTimeMillis()-startTime));
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            integersLink.get((int) Math.random() * (countElement-1));
        }
        System.out.println("Время выполнения Link: "+(System.currentTimeMillis()-startTime));
    }
}
