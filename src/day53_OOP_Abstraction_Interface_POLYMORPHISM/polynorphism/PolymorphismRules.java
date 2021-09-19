package day53_OOP_Abstraction_Interface_POLYMORPHISM.polynorphism;

import day45_OOP_Inheritance.animalTask.Animal;
import day45_OOP_Inheritance.animalTask.Dog;
import day47_OOP_Inheritance_FinalKeyWord_RECAP.phoneTask.IPhone;
import day47_OOP_Inheritance_FinalKeyWord_RECAP.phoneTask.Phone;
import day47_OOP_Inheritance_FinalKeyWord_RECAP.phoneTask.Samsung;
import day53_OOP_Abstraction_Interface_POLYMORPHISM.webDriverTask.ChromeDriver;
import day53_OOP_Abstraction_Interface_POLYMORPHISM.webDriverTask.WebDriver;

public class PolymorphismRules {

    public static void main(String[] args) {

        Phone phone1 = new IPhone("12","large","black",1000);
        phone1.call(123456);
        phone1.text(123456);
        ((IPhone) phone1).faceTime(789456);

        Phone phone2 = new Samsung("S16","medium","white",900);

        /*
        WebDriver driver = new ChromeDriver();
        driver.get();
        ((TakeScreenShot)driver).takeScreenShot()
        driver.executeScript()
         */

        System.out.println("************************************************");

        WebDriver driver = new ChromeDriver();
        driver.get("ww.Amazon.com");


        System.out.println("************************************************");

        Animal animal = new Dog("Lucy","Husky",'M',"Large",5,"Grey");
        animal.drink("milk");
        animal.eat("Dog food");
        animal.sleep();
        //  animal.bark();//because bark() method belongs to Dog subclass not Animal super class


//        int a = 20000;
//        byte b = (byte)a;
//        System.out.println(b);

    }
}
