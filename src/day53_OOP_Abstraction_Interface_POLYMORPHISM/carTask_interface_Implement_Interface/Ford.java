package day53_OOP_Abstraction_Interface_POLYMORPHISM.carTask_interface_Implement_Interface;

public class Ford extends Car{
    public Ford( String model, String color, int year, double price) {
        super("Ford", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Starting Ford "+getModel());

    }

    @Override
    public void drive() {
        System.out.println("Driving Ford "+getModel());

    }
}
