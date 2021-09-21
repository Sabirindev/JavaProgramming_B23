package oop.encapsulation.task1;

public class Encapsulation2 {
    public static void main(String[] args) {
        Encapsulation1 car = new Encapsulation1();

        car.getCarName();
        car.setCarName("Toioyota");
        car.setCarName("bmw");

        Encapsulation1 car2 = new Encapsulation1();

        car2.setCarName("Audi");
        //private static filed' value can only be changed from
        //other class by declaring setterr() method as static in that class.
        Encapsulation1.setLibraryName("Manhattan librar");

        System.out.println(car);
        System.out.println(car2);

    }
}
