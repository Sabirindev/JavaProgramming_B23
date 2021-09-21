package oop.polymorphism;

abstract class Car {

}

class BMW extends Car {

}

class Toyota extends Car {

}

public class CarDealer {
    public static void main(String[] args) {
        BMW bmw = new BMW();
        Car car1 = (Car) bmw;
        Toyota toyota1 = new Toyota();
        //Toyota toyota = (Toyota) bmw;//compile error because siblings(Toyota and BMW)can not be casted each other

        //BMW bmw2 = (BMW) toyota1;////compile error because siblings(Toyota and BMW)can not be casted each other
    }
}
