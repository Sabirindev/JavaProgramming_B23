package day51_OOP_Abstraction.shapeTask;

public final class Square extends Shape {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side <= 0) {
            throw new RuntimeException("invalid side value: " + side);
        }
        this.side = side;
    }

    public Square(double side) {
        super("Square");
        setSide(side);//this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }
}
