package day47_OOP_Inheritance_FinalKeyWord_RECAP.phoneTask;

public class Nokia extends Phone{
    public Nokia( String model, String size, String color, double price) {
        super("Nokia", model, size, color, price);
    }

    public void selfDefense(){
        System.out.println(getBrand()+" "+getModel()+" is designed for self defense");
    }

    public void breakTheFloor(){
        System.out.println(getBrand()+" "+getModel()+" can break the floor");

    }
}
