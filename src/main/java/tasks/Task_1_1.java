package tasks;

import java.util.Arrays;

public class Task_1_1 {
    public static void main(String[] args) {
        int[] array = new int[]{1,4,2,7,1,8};
        System.out.println(Arrays.toString(array));
        sortArray(array);
        System.out.println(Arrays.toString(array));
    }
    public static int[] sortArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[i]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;
    }
}
