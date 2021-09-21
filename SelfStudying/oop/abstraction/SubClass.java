package oop.abstraction;

public class SubClass extends AbstractClass implements Interface1{
    @Override
    public void method2() {
        System.out.println("method2 is abstract method from Abstartc class is overrided in SubClass");
    }



    public void method3(){
        System.out.println("method3 is abstract method from Abstartc class is overrided in SubClass");
    }

    public static void main(String[] args) {
        SubClass objSubclass = new SubClass();

        System.out.println("\n************* extends Abstarct class ********************");
        //instance varibale from abstract class (super class) is called by obj name
        System.out.println("objSubclass.carName = " + objSubclass.carName);

        //staic varibale fromabstract class (super class) is call by class name
        AbstractClass.street = "Baku street";

        //method2 is abstract method from Abstartc class is overrided in SubClass
        objSubclass.method2();
        //method3 is abstract method from Abstartc class is overrided in SubClass
        objSubclass.method3();

        System.out.println("\n************* implements Interface ********************");

        System.out.println("Interface1.nameOfSchool = " + Interface1.nameOfSchool);


    }
}
