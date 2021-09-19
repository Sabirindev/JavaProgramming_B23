package day53_OOP_Abstraction_Interface_POLYMORPHISM.carTask_interface_Implement_Interface;
class A{
    final static int a;

    static {
        a =100;
    }

    int b;
    {
        b=200;
    }


}

public interface ElectricCar {



    boolean hasBattery = true; // public static final by default

    void charging();// this is public abstract method,
                    // inside interface these keyword( public and abstract)
                   // are used implicitly

    // 1 abstract method

    /*
    what we cannnot have:
    static{
    }
    {
    }
    void method1(){ //regular method
    }
    public ElectricCar(){ //constructor
    }
    instance variable
     */

}
