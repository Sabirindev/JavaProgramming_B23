package day41_CustomClass_Constructor.circleTask;

public class Circle {

    public double radius;
    public double diameter;

    public static double PI;

    static {
        PI = 3.14;
    }

//    public void Circle(){
//        System.out.println("Custome");
//    }

    public Circle(double radius) {  //as Class name
        this.radius = radius;
        diameter = 2 * radius;
    }

    public double circleArea() {
        return Math.pow(radius, 2) * PI;// radius * radius * PI
    }

    public double circlePerimeter() {
        return diameter * PI;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", area of circle = "+ circleArea() +
                ", perimeter of circle = "+ circlePerimeter() +
                '}';
    }
}
