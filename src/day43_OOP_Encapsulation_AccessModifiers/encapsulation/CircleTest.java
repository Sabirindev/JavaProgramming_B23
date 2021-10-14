package day43_OOP_Encapsulation_AccessModifiers.encapsulation;

class Aaa {
    private double radius = 1;
    private static String name = "Sabir";

    public double getarea(){
        return radius*radius*Math.PI;
    }

}
public class CircleTest{
    public static void main(String[] args) {
        Aaa a = new Aaa();
       // System.out.println("a.radius = " + a.radius);
        System.out.println("a.getarea() = " + a.getarea());

    }
}
