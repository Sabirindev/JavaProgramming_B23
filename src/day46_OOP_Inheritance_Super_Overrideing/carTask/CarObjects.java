package day46_OOP_Inheritance_Super_Overrideing.carTask;

public class CarObjects {
    public static void main(String[] args) {
        //System.out.println(Tesla.isElectric);

        //super class object is "car"
        Car car= new Car("toyota","bbb",2000,5000,"black",15);

        car.drive();




        System.out.println("************ Toyota **************");
        Toyota toyota = new Toyota("Camry",2012,15000,"Red",165000);
        toyota.start();


//        System.out.println("\n************ Tesla **************");
//        Tesla tesla = new Tesla("S model",2021,120000,"Black",0);
//        tesla.start();
//
//        System.out.println("\n************ BMW **************");
//        BMW bmw = new BMW("X6",2015,65000,"Blue",45000);
//        bmw.start();
    }
}
