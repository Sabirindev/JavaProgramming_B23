package shoppingCenter;

public class Product {
    // Boiler Plate
    public String name;
    public int quantity;
    public double price;


    public Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
/*
==	Create a class called Product

		Instance Variables :
			- name (String), quantity(int),price(double)
		Instance Methods   :
			- toString - > returns information about Product
		Constructor  	   :
			- All Arg Constructor
 */
