package day51_OOP_Abstraction.carTask;

public final class BMW extends Car{

    public BMW(String model, String color, int year, double price) {
        super("BMW", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("*********************************************************");
        System.out.println("call mechanic");
        System.out.println("jump start");
        System.out.println("oil change");
        System.out.println("*********************************************************");
    }

    @Override
    public void drive() {

    }

//    @Override
//    public String toString() {
//        return "BMW{" + super.toString()+
//                "" +
//                "}";
//    }
}
