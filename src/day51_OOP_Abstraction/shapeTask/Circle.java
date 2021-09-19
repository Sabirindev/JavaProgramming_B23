package day51_OOP_Abstraction.shapeTask;

public final class Circle extends Shape {

    private double r;
    public final static double PI = 3.14;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        if (r<=0){
            throw new RuntimeException("This is Invalid radius: "+r);
        }
        this.r = r;
    }

    public Circle(double r) {
        super("Circle");
        setR(r);
    }


    @Override
    public double area() {
        return r * r * PI;
    }

    @Override
    public double perimeter() {
        return 2 * r * PI;
    }
}
