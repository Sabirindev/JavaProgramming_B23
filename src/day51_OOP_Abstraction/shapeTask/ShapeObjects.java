package day51_OOP_Abstraction.shapeTask;

public class ShapeObjects {
    public static void main(String[] args) {
        //Shape obj = new Shape(); // we can not create object from abstract class

        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(5,6);
        Square square = new Square(9);


        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);


    }
}
