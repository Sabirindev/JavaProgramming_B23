package day42_CustomClass_Constructor_this_GarbageCollection.carTask;

public class Car {
    public String make,model;
    public int year;
    public double price;
    public String color;

    public Car(String make){
        this.make = make;
    }

    public Car(String make, String model) {
        this(make);//this.make = make;
        this.model = model;
    }

    public Car(String make, String model, int year) {
        this(make,model); //this.make = make; this.model = model;
        this.year = year;
    }

    public Car(String make, String model, int year, double price) {
        this(make,model,year);//this.make = make; this.model = model; this.year = year;
        this.price = price;
    }

    public Car(String make, String model, int year, double price, String color) {
        this(make,model,year,price);// this.make = make; this.model = model; this.year = year; this.price = price;
        this.color = color;
    }

    public Car(int year, double price, String color) {
        this(null, null, year, price, color);
    }

    public Car(int year, double price) {
        this(year, price, null);
    }

    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
/*
2. class name: Car
		 instance variables:
		 		make, model, year, price, color

 		1st constructor: initializes the make ONLY

 		2nd constructor: initializes make & model
 				(MUST use constructor call to set the make)

		3rd constructor: initializes make, model, year
				(MUST use constructor call to set the make, model)

		4th constructor: initializes make, mode, year, price
				(MUST use constructor call to set the make, model, year)

		5th Constructor: intializes all the instances
				(MUST use constructor call to set the make, mode, year, price, color)

		instance methods: toString
 */
