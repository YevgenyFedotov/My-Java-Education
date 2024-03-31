package TasksPart10;

public class Rectangle extends GeometricObject{
    double width = -1;
    double height = -1;

    Rectangle(){}
    Rectangle(double width, double hight){
        this.width = width;
        this.height = hight;
    }

    public double getArea(){
        return this.width * this.height;
    }
    public  double getPerimeter(){
        return 2*(this.width + this.height);
    }
    public String toString(){
        System.out.print("Прямоугольник\t" + getDateCreated().toString());
        return "\nЗакрашен: " + super.isFiled() + ",\tЦвет: " + super.getColor() + ",\tДлина = " + width + ",\tШирина = " + height;
    }
}
