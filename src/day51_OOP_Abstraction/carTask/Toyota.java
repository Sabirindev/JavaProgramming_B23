package day51_OOP_Abstraction.carTask;

public final class Toyota extends Car{
    public Toyota(String model, String color, int year, double price) {
        super("Toyota", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("**********************************************");
        System.out.println(getMake()+" "+getModel()+" is driving");
        System.out.println("Inserrt key");
        System.out.println("Twist the key");
        System.out.println("**********************************************");
    }

    @Override
    public void drive() {

    }
}
