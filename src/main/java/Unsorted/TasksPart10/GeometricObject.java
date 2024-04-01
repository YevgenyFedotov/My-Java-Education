package Unsorted.TasksPart10;

import java.util.Date;

public abstract class GeometricObject implements Comparable<GeometricObject> {
    private String color = "белый";
    private boolean filed = false;
    private Date dateCreated;

    protected GeometricObject(){
        dateCreated = new Date();
    }
    protected GeometricObject(String color, boolean filed){
        this.color = color;
        this.filed = filed;
        dateCreated = new Date();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFiled() {
        return filed;
    }

    public void setFiled(boolean filed) {
        this.filed = filed;
    }
    @Override
    public abstract String toString();

    public Date getDateCreated() {
        return dateCreated;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public int compareTo(GeometricObject object){
        if (this.getArea() < object.getArea()){
            return -1;
        } else if ( this.getArea() == object.getArea()){
            return 0;
        } else
            return 1;
    }

    public static GeometricObject max (GeometricObject object1 , GeometricObject object2){
        if ( object1.compareTo(object2) > 0){
            return object1;
        } else return object2;
    }


}
