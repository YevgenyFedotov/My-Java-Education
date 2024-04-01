package Unsorted.TasksPart10;

public class Octagon extends GeometricObject implements Cloneable{
    double side;

    public Octagon(){
        this(1);
    }
    public Octagon(double side){
        this.side = side;
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    public double getArea() {
        return (2 + (4/Math.sqrt(2))) * side * side;
    }

    @Override
    public double getPerimeter() {
        return side * 8;
    }

    @Override
    public Object clone(){
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
