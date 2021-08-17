package day43_OOP_Encapsulation_AccessModifiers.objectTask;

public class Circle {

    private double radius, diameter;

    private static double PI = 3.14;

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setRadius(double radius) {

        if (radius < 0) {
            System.out.println("Radius of the circle can not be negative");
            return;
        }

        this.radius = radius;
        diameter = radius*2;
    }

    public void setDiameter(double diameter) {

        if (diameter < 0) {
            System.out.println("diameter of the circle can not be negative");
            return;
        }

        this.diameter = diameter;
        radius = diameter/2;
    }


    public Circle(double radius) { //Constructor
        setRadius(radius);
    }

    public double areaCircle(){
        return radius*radius * PI;
    }

    public double perimeterCircle(){
        return diameter * PI;
    }

    public boolean equals(Circle circle){
        return radius == circle.radius;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                '}';
    }
}
/*
Task:
    1. Create a class named Circle
            Private variables:
                radius, diameter, PI

            generate getter & setter for all private fields
                    Make sure that radius & diameter of circle can never be set to negative

            add a constructor that can set all the fields

            Extra methods:
                equal(): accepts a Circle Object and returns true if the given circle is equal to the current circle
                calcArea(): returns the area
                calcPerimeter(): returns the perimeter
                toString()
 */
