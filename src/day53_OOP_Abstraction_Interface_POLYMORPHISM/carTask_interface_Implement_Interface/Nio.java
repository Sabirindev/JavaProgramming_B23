package day53_OOP_Abstraction_Interface_POLYMORPHISM.carTask_interface_Implement_Interface;

public class Nio extends Car  implements ElectricCar,AutoPilot{
    public Nio( String model, String color, int year, double price) {
        super("Nio", model, color, year, price);
    }

    @Override
    public void autoPark() {
        System.out.println("Auto-parking Nio "+getModel());

    }

    @Override
    public void selfDrive() {
        System.out.println("SelfDrive is on for Nio "+getModel());

    }

    @Override
    public void start() {
        System.out.println("Astarting Nio "+getModel());

    }

    @Override
    public void drive() {
        System.out.println("Driving Nio "+getModel());

    }

    @Override
    public void charging() {
        System.out.println("Charging Nio "+getModel());

    }
}
