package day37_Custom_Class;

import java.util.ArrayList;
import java.util.Arrays;

public class DogPark {
    public static void main(String[] args) {
        CC_Dog dog1 = new CC_Dog();
        dog1.name = "Kangal";
        dog1.gender ="Female";
        dog1.breed = "Kangal";
        dog1.age = 5;
        dog1.size = "large";
        dog1.color = "white";


        System.out.println(dog1.name);
        System.out.println(dog1.gender);
        System.out.println(dog1.breed);
        System.out.println(dog1.size);
        System.out.println(dog1.age);
        System.out.println(dog1.color);

        CC_Dog dog2 = new CC_Dog();
        dog2.setInfo("Caucasian Shepherd dog",5,"Male",
                "Shepherd dog","Large","Black and White");

        CC_Dog dog3 = new CC_Dog();
        dog3.setInfo("ninja",5,"Male","Blue","Medium", "Gray");

        dog1.bark();
        dog2.bark();
        dog3.bark();

        System.out.println("************************************************************");
        dog2.eat("Meat");
        dog1.eat("Pizza");
        dog1.drink("Milk");
        dog2.drink("Water");
        dog1.play();
        dog2.play();

        System.out.println("***************************************************************");
        dog2.getInfo();

        System.out.println("\n**********************************************************");
        dog1.getInfo();

        System.out.println("\n****************************************************************");

        CC_Dog[] dogsArr = {dog1,dog2,dog3};

        ArrayList<CC_Dog> dogsList = new ArrayList<>();
        dogsList.addAll(Arrays.asList(dogsArr));

        System.out.println(dogsList);




    }
}

