package day53_OOP_Abstraction_Interface_POLYMORPHISM.polynorphism;

import day45_OOP_Inheritance.animalTask.Animal;
import day45_OOP_Inheritance.animalTask.Cat;
import day45_OOP_Inheritance.animalTask.Dog;
import day45_OOP_Inheritance.employeeTask.Developer;
import day45_OOP_Inheritance.employeeTask.Employee;
import day45_OOP_Inheritance.employeeTask.Tester;

public class RefereanceTypeCasting {
    public static void main(String[] args) {

        Animal animal = new Dog("Lucy","Husky",'M',"Large",5,"Grey");
        animal.drink("milk");
        animal.eat("Dog food");
        animal.sleep();
        //((Dog)animal).bark();

        Dog dog = (Dog)animal;
        ((Dog) animal).bark(); //down casting

        System.out.println("*******************************************************************");

        Employee employee = new Tester("Sabir",'M',35,131313,"SDET Lead",13131.3);
        employee.eat("Kabab");
        employee.drink("Water");
        employee.sleep();
        employee.attendmeeting();
        employee.work();
        ((Tester)employee).testing();//down casting
        ((Developer)employee).fixBugs(); //Tester is not developer

        System.out.println("-----------------------------------------------------------");

        Animal animal2 = new Cat("Lucy", "Husky", 'M', "Large", 10, "White"); // up casting
        animal2.sleep();
        animal2.eat("Cat Food");
        animal2.drink("Milk");
        ((Cat) animal2).meow();
        //       ( (Dog)animal2 ).bark();  // Cat IS not A Dog

    }
}
