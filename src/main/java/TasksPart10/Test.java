package TasksPart10;

public class Test {
    public static void main(String[] args) throws IllegalTriangleException {
        GeometricObject circle1 = new Circle(5);
        GeometricObject circle2 = new Circle(5);
        System.out.println(circle1.equals(circle2));
        Object object1 = new Object();
        Object object2 = new Object();
        object1.equals(object2);
    }
}

