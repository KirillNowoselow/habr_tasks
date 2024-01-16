package tasks;

public class Task_1_0 {
    public static void main(String[] args) {
        double[] array = new double[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
        double max = array[0];
        double min = array[0];
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            if(max < array[i])
                max = array[i];
            if(min > array[i])
                min = array[i];
            sum += array[i];
        }
        double avg = sum/array.length;
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avg = " + avg);
    }

}
