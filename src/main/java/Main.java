import classes.Vector;

public class Main {
    public static void main(String[] args) {
        Vector vector = new Vector(1, 2,3);
        Vector vector1 = new Vector(4, 5,6);

        System.out.println(vector.vectorLength());
        System.out.println(vector.vectorCos(vector1));
        System.out.println(Vector.vectorList(4));
    }

    public static int searchElement(double[] array, double key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key)
                return i;
        }
        return -1;
    }

}
