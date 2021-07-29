package day37_Custom_Class;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import day15_String_Method.StringIntro;

public class CC_Dog { //custom class Dog

    //***Atributes of Dog class*****
    public String name; //
    public String breed;
    public int age;
    public String size;
    public String color;
    public String gender;

    //***Actions of Dog class *****
    public void eat(String food) {
        System.out.println(name + " is eating " + food);
    }

    public void drink(String drink) {
        System.out.println(name + " is drinking " + drink);
    }

    public void bark() {
        System.out.println(name + " is barking");
    }

    public void play() {
        System.out.println(name + " is playing");
    }

    public void setInfo(String dogName, int dogAge, String dogGender, String dogBreed, String dogSize, String dogColor) {
        name = dogName;
        breed = dogBreed;
        age = dogAge;
        gender = dogGender;
        size = dogSize;
        color = dogColor;
    }

    public void getInfo() {
        System.out.println("Name = " + name);
        System.out.println("Breed = " + breed);
        System.out.println("color = " + color);
        System.out.println("Gender = "+gender);
        System.out.println("size = " + size);
        System.out.println("age = " + age);
    }

}
