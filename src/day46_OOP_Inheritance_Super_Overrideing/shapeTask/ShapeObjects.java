package day46_OOP_Inheritance_Super_Overrideing.shapeTask;

public class ShapeObjects {
    public static void main(String[] args) {
        System.out.println("\n****************** Circle Objects ****************************");
        Circle circle =new Circle(3);
        System.out.println(circle);
        System.out.println(circle.area());
        System.out.println(circle.perimeter());


        System.out.println("\n****************** Rectangle Objects ****************************");
        Rectangle rectangle = new Rectangle(10,5);
        System.out.println(rectangle);
        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());

        System.out.println("\n****************** Square Objects ****************************");
        Square square =new Square(5);
        System.out.println(square);
        System.out.println(square.area());
        System.out.println(square.perimeter());
    }
}
