package classes.shapesHierarchyWithInterfaces;

abstract class SolidOfRevolution implements Shape{
    protected double radius;
    public SolidOfRevolution(double radius){
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return 0;
    }
}
