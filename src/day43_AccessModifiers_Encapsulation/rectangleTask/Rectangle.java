package day43_AccessModifiers_Encapsulation.rectangleTask;

public class Rectangle {
    private double length, width;

    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length<0){
            return;
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width<0){
            return;
        }
        this.width = width;
    }

    public double areaRectangle(){
        return length*width;
    }

    public double perimeterRectangle(){
        return 2*(length+width);
    }

    public boolean equals(Rectangle rectangle){
        return perimeterRectangle() == rectangle.perimeterRectangle();
    }

    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
