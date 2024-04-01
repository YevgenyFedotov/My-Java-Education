package Unsorted.TasksPart10;

public class Triangle extends GeometricObject{
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle(){

    }
    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException{
        if ( (side1 + side2) <= side3 || (side1 + side3) <= side2 || (side2 + side3) < side1){
            throw new IllegalTriangleException();
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

    }

    public double getSide1() {
        return side1;
    }
    public double getSide2() {
        return side2;
    }
    public double getSide3() {
        return side3;
    }
    @Override
    public double getArea(){
        double s = getPerimeter() / 2.0;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    @Override
    public double getPerimeter(){
        return side1 + side2 + side3;
    }

    @Override
    public String toString(){
        System.out.print("Треугольник\t" + getDateCreated().toString());
        return "\nЗакрашен: " + super.isFiled() + ",\tЦвет: " + super.getColor() + ",\tсторона 1 = " + side1 + ",\tсторона 2 = " + side2 + ",\tсторона 3 = " + side3;
    }
}
