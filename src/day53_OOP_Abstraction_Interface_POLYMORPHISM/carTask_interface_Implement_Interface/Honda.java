package day53_OOP_Abstraction_Interface_POLYMORPHISM.carTask_interface_Implement_Interface;

public class Honda extends Car{
    public Honda(String model, String color, int year, double price) {
        super("Honda", model, color, year, price);
    }

    @Override
    public String getMake() {
        return super.getMake();
    }

    @Override
    public void start() {
        System.out.println("Starting Honda "+getModel());

    }

    @Override
    public void drive() {
        System.out.println("Driving honda "+getModel());

    }
}
