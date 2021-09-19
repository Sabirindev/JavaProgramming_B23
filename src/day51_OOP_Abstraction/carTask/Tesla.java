package day51_OOP_Abstraction.carTask;

public final class Tesla extends Car{

    public Tesla(String model, String color, int year, double price) {
        super("Tesla", model, color, year, price);
    }

    public void autoPilot(){
        System.out.println("Tesla "+getModel()+" is self driving");
    }

    @Override
    public void start() {
        System.out.println("****************************************");
        System.out.println("Say \"start\"");
        System.out.println("*****************************************");
    }

    @Override
    public void drive() {

    }
}
