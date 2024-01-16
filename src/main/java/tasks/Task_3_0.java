package tasks;


import java.util.Arrays;

public class Task_3_0 {
    public static void main(String[] args) {
        int[] array = new int[]{5,1,2,3,4,5,7,5,32,2};
        int[] sortArray = sortArray(array);
        System.out.println(Arrays.toString(sortArray));
        System.out.println(searchElement(array, 1));
        System.out.println(binarySearch(sortArray, 1, 0, sortArray.length));
    }
    public static int searchElement(int[] array, int key){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] sortArray, int key, int low, int high) {
        int index = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (sortArray[mid] < key) {
                low = mid + 1;
            } else if (sortArray[mid] > key) {
                high = mid - 1;
            } else if (sortArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
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
