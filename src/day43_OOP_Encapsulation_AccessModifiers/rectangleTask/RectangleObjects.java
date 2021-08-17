package day43_OOP_Encapsulation_AccessModifiers.rectangleTask;

public class RectangleObjects {
    public static void main(String[] args) {
        Rectangle rectangle1 =new Rectangle(10,5);
        System.out.println(rectangle1);

        System.out.println("********************************");

        rectangle1.setLength(5);
        rectangle1.setWidth(6);

        System.out.println(rectangle1);

        Rectangle r2 = new Rectangle(6, 5);
        System.out.println(r2);

        System.out.println(rectangle1.equals(r2));
    }
}
