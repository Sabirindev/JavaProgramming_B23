package day53_OOP_Abstraction_Interface_POLYMORPHISM.carTask_interface_Implement_Interface;

public class Tesla extends Car implements AutoPilot,ElectricCar{
    public Tesla( String model, String color, int year, double price) {
        super("Tesla", model, color, year, price);
    }

    @Override
    public void autoPark() {
        System.out.println("Auto-parking Tesla"+getModel());

    }

    @Override
    public void selfDrive() {
        System.out.println("SelfDrive ison for Tesla "+getModel());

    }

    @Override
    public void start() {
        System.out.println("Starting Tesla "+getModel());

    }

    @Override
    public void drive() {
        System.out.println("Driving Tesla "+getModel());


    }

    @Override
    public void charging() {
        System.out.println("Charging Tesla "+getModel());

    }

    public void dogMode(){
        System.out.println("Tesla"+getModel()+" ins in dog mode");

    }
}
