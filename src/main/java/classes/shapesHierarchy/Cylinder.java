package classes.shapesHierarchy;

public class Cylinder extends SolidOfRevolution{
    private double height;

    public Cylinder(double height, double radius) {
        super(Math.PI * radius * radius * height, radius);
        this.height = height;
    }
}
