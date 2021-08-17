package day46_OOP_Inheritance_Super_Overrideing.carTask;

public class BMW extends Car{

    public static boolean isLuxuryBrand = true;

    public BMW(String model, int year, double price, String color, long miles) {
        super("BMW", model, year, price, color, miles);
    }

    @Override
    public void start() {
        System.out.println("Call Mechanic");
        System.out.println("Oil change");
        System.out.println("Jump start");
    }
}
