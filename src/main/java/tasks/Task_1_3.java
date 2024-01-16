package tasks;

import java.util.ArrayList;

public class Task_1_3 {
    public static void main(String[] args) {
        int[] array = new int[]{5,1,2,3,4,5,5,5,32,2};
        System.out.println(deleteNum(array, 2));
    }

    public static ArrayList deleteNum(int[] array, int val){
        ArrayList newArray = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] != val){
                newArray.add(array[i]);
            }
        }
        return newArray;
    }
}
