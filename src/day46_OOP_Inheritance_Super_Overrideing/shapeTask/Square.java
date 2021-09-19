package day46_OOP_Inheritance_Super_Overrideing.shapeTask;

public class Square extends Shape{
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side < 0){
            System.out.println("Side of Suare can not be negative");
            return;
        }
        this.side = side;
    }

    public Square(double side) { //Constructor
        super("Square");
        setSide(side);//this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return side * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                super.toString() +
                '}';
    }
}
