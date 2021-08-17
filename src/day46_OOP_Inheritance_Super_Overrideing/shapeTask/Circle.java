package day46_OOP_Inheritance_Super_Overrideing.shapeTask;

public class Circle extends Shape {
    private double radius, diameter;
    private final static double PI = 3.14;

    public Circle(double radius, double diameter) {
        super("Circle");
        setRadius(radius);
        this.diameter = radius * 2;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius < 0) {
            System.out.println("radius can not be negative");
            return;
        }
        this.radius = radius;
        diameter = 2 * radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        if(diameter < 0){
            System.out.println("diameter can not be negative");
            return;
        }
        this.diameter = diameter;
        radius = diameter/2;
    }

    @Override
    public double area() {
        return radius * radius * PI;
    }

    @Override
    public double perimeter() {
        return diameter * PI;
    }
}
