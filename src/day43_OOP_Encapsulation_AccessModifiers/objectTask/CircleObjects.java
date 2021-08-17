package day43_OOP_Encapsulation_AccessModifiers.objectTask;


public class CircleObjects {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        circle1.areaCircle();
        System.out.println(circle1);

        circle1.setRadius(3);

        System.out.println(circle1);
        System.out.println(circle1.areaCircle());
        System.out.println(circle1.perimeterCircle());


        Circle circle2 = new Circle(3);
        System.out.println(circle1.equals(circle2));

    }
}
