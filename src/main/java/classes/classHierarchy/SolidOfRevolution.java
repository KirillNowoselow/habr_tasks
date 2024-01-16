package classes.classHierarchy;

import lombok.Data;

@Data
public class SolidOfRevolution extends Shape {
    private double radius;

    public SolidOfRevolution(double volume, double radius) {
        super(volume);
        this.radius = radius;
    }
}
