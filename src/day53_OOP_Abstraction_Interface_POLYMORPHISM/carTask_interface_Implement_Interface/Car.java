package day53_OOP_Abstraction_Interface_POLYMORPHISM.carTask_interface_Implement_Interface;

public abstract class Car {// abstarct parent class contain comman features for its all subclass
    private final String make;
    private final String model;
    private String color;
    private final int year;
    private double price;

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Car(String make, String model, String color, int year, double price) {
        this.make = make;
        this.model = model;
        setColor(color);//this.color = color;
        this.year = year;
        setPrice(price);//this.price = price;
    }

    public abstract void start();
    public abstract void drive();

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
/*
ar Task
	1. create an abstract class named Car
			private variables:
				make (final), model (final), color, year (final), price

			Encapsulate all the fields

			Add a constructor to set all the fields

			abstract method:
				start();
				driver();

			non-abstract method:
				toString
 */
