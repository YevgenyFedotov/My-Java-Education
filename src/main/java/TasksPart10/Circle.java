package TasksPart10;

import java.lang.Math;

public class Circle extends GeometricObject{
    private double radius;

    Circle(){
        this.radius = 1;
    }

    Circle(double radius){
        this.radius = radius;
    }
    public void printRadius(){
        //radius = 3;
        System.out.println(radius);
    }
    @Override
    public String toString() {
        System.out.print("Круг\t" + getDateCreated().toString());
        return "\nЗакрашен: " + super.isFiled() + ",\tЦвет: " + super.getColor() + ",\tрадиус = " + radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2.0 * Math.PI * radius;
    }

}
