package day46_OOP_Inheritance_Super_Overrideing.carTask;

public class Toyota extends Car{

    public static boolean isReliable = true;

    public Toyota(String model, int year, double price, String color, long miles) {
        super("Toyota", model, year, price, color, miles);

    }


}
