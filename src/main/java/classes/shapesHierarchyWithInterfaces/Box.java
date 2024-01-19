package classes.shapesHierarchyWithInterfaces;

import java.util.ArrayList;

public class Box implements Shape{
    private ArrayList<Shape> shapes = new ArrayList<>();
    private double available;
    private double volume;
    public Box(double availabel){
        this.available = availabel;
        this.volume = volume;
    }
    public boolean addShape(Shape shape){
        if (available >= shape.getVolume()){
            shapes.add(shape);
            available -= shape.getVolume();
            return true;
        }else {return false;}
    }
    public ArrayList<Shape> getShapes(){
        return shapes;
    }

    @Override
    public double getVolume() {
        return volume;
    }
}
