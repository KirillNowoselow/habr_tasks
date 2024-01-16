package classes;

import lombok.Data;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
@Data

public class Vector {
    private double x;
    private double y;
    private double z;
    public Vector (double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double vectorLength(){
        return Math.sqrt(x*x+y*y+z*z);
    }

    public double scalarProd(Vector vector){
        return x*vector.x+y*vector.y+z*vector.z;
    }

    public Vector vektorProd(Vector vector){
        return new Vector (
                y*vector.z-z*vector.y,
                z*vector.x-x*vector.z,
                x*vector.y-y*vector.x
                );
    }

    public double vectorCos(Vector vector){
        return scalarProd(vector)/(vectorLength()*Math.abs(vector.vectorLength()));
    }

    public Vector vectorSum(Vector vector){
        return new Vector (
                x+vector.x,
                y+vector.y,
                z+vector.z
        );
    }

    public Vector vectorDiff(Vector vector){
        return new Vector (
                x-vector.x,
                y-vector.y,
                z-vector.z
        );
    }

    public static List vectorList(int N){
        List vectorList = new ArrayList();
        for (int i=0; i<N;i++){
            Random rnd = new Random();
            Vector vector = new Vector(rnd.nextDouble(), rnd.nextDouble(), rnd.nextDouble());
            vectorList.add(vector);
        }
        return vectorList;
    }

    public String toString(){
        return ""+x+", "+y+", "+z+"";
    }
}
