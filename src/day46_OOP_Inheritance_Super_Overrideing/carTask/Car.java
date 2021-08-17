package day46_OOP_Inheritance_Super_Overrideing.carTask;

public class Car {
    public String brand;
    public String model;
    public int year;
    public double price;
    public String color;
    public long miles;

    public Car(String brand, String model, int year, double price, String color, long miles) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.miles = miles;
    }

    public void start(){
        //System.out.println(brand+" "+model+" is starting");
        System.out.println("Insert the key");
        System.out.println("Twist it to the ignition");
    }

    public void drive(){
        System.out.println(brand+" "+model+" is ready to drive");
    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", miles=" + miles +
                '}';
    }
}


/*
CarTask:
    Create a class called Car
        instance variables:
            brand, model, year, price, color, miles

            add a constructor to set all the fields

        instance methods:
            start(), drive(), toString()

    Create the following sub classes of Car:
        1. Toyota
        2. BMW
        3. Tesla:
             extra methods: autoPilot();
 */
