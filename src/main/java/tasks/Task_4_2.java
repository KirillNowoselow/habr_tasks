package tasks;

import classes.shapesHierarchyWithInterfaces.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Task_4_2 {
    public static void main(String[] args) {
        Ball ball = new Ball(4.5);
        Cylinder cylinder = new Cylinder(2, 2);
        Pyramid pyramid = new Pyramid(10, 10);

        Box box = new Box(10000);

        System.out.println(box.addShape(ball));
        System.out.println(box.addShape(cylinder));
        System.out.println(box.addShape(pyramid));
    }
}
