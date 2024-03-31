package TasksPart10;

public class Square extends GeometricObject implements Colorable{
    private double side;

    public Square(){
        this(1);
    }

    public Square(double side){
        this.side = side;
    }

    public double getSide(){
        return side;
    }

    @Override
    public String toString() {
        System.out.print("Квадрат\t" + getDateCreated().toString());
        return "\nЗакрашен: " + super.isFiled() + ",\tЦвет: " + super.getColor() + ",\tсторона = " + side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public void howToColor() {
        System.out.println("Раскрасьте все четыре стороны");
    }
}
