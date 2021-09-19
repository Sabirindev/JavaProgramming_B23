package day53_OOP_Abstraction_Interface_POLYMORPHISM.carTask_interface_Implement_Interface;

public class CarShop {
    public static void main(String[] args) {

        System.out.println("******************** Honda ************************");
        Honda honda =new Honda("Civic","dark blue",2018,19500);
        honda.drive();
        honda.start();
        //honda.selfDrive();
        //honda.autoParking();
        //honda.charging();

        System.out.println("\n******************** Ford ************************");

        Ford ford =new Ford("Mustang","black",2019,25800);
        ford.drive();
        ford.start();
        //ford.selfDrive();
        //ford.autoParking();
        //ford.charging();

        System.out.println("\n******************** Porsche ************************");

        Porsche porsche=new Porsche("Cayman","red",2017,68000);
        porsche.drive();
        porsche.start();
        //porsche.selfDrive();
        porsche.autoPark();
        //porsche.charging();

        System.out.println("\n******************** Audi ************************");

        Audi audi =new Audi("A8","white",2020,83400);
        audi.drive();
        audi.start();
        //audi.selfDrive();
        audi.autoPark();
        //  audi.charging();

        System.out.println("\n******************** Tesla ************************");

        Tesla tesla =new Tesla("S","blue",2021,120000);
        tesla.drive();
        tesla.start();
        tesla.selfDrive();
        tesla.autoPark();
        tesla.charging();

        System.out.println("\n******************** Nio ************************");

        Nio nio =new Nio("ET7","white",2020,68000);
        nio.drive();
        nio.start();
        nio.selfDrive();
        nio.autoPark();
        nio.charging();

        System.out.println("\n**************** Polymorpisim ********");

        Car[] car = {honda, ford, audi, porsche, tesla, nio};
    }
}
