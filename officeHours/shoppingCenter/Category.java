package shoppingCenter;

import java.util.ArrayList;

public class Category {

    public String name;
    public ArrayList<Product> products;
    public static String companyName;
    public static int totalEarning;


    public Category(String name) {
        this(name,new ArrayList<>());
        //this.name = name;
        //products=new ArrayList<>();
    }

    public Category(String name, ArrayList<Product> products) {
        this.name = name;
        this.products = products;
    }




    public void addProduct(Product product){

        for (Product p : products) {  // refers each product of arrayList
            if(p.name.equals(product.name)){
                if(p.price==product.price){
                    p.quantity+=product.quantity;
                    System.out.println(product.name+" is already exist");
                    System.out.println("Quantity is increaased by "+ product.quantity);
                }
                else
                {
                    System.out.println(product.name+ " is already exist");
                    System.out.println("check "+ product.name+" price");
                }
                return;
            }
        }

        products.add(product);
        System.out.println(product.name+" is added");

    }

    public void addProduct(ArrayList<Product> product){

        for (Product p : product) { // refers each product
            addProduct(p);
        }

    }
    /*
    public void sellProduct(Product product){
        for (Product p : products) {
            if (p.name.equals(product.name)) {
                if (p.quantity >= product.quantity) {
                    p.quantity-= product.quantity;
                    totalEarning+= product.quantity* product.price;
                    System.out.println(product.name+" quantity is decreased by "+ product.quantity);
                } else {
                    System.out.println(product.name+" quantity is not enough to sell");
                }
                return;
            }
        }
        System.out.println(product.name+ " does not exist");
    }
    public void sellProduct(ArrayList<Product> product){
        for (Product p : product) {
            sellProduct(p);
        }
    }
    */


    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", products=" + products +
                '}';
    }
}
/*
==	Create a class called Category

		Instance Variables :
			- name(String) , ArrayList<Product> products

		Constructor  	   :
			- One Parameter (String name) -> Use this() to call All Arg Constr
			- Two parameter (String name,ArrayList<Product> products)

		Static Variables   :
			- companyName
			- totalEarnings

		Instance Methods   :
			- toString - > returns information about Category

			- addProduct(Product product)->Adds given product quantity to the arrayList products
			- addProduct(ArrayList<Product> product)->Adds given products quantity to the arrayList products

				NOTE: Before adding check this product exist or not

					  if it is exist ;
					  	- if prices are same, increase quantity otherwise give an error message
					  	  	ERROR :Check $product price

					  if it is not exist ;
					  	- Add product/products in arrayList(products)


			- sellProduct(Product product) ->Removes given product quantity from the arrayList products

			- sellProduct(ArrayList<Product> product)->Removes given product quantity from the arrayList products

				NOTE: Before sell product check productList

					  if it is exist ;
						  	- if quantity is enough to sell, sell it
						  		Update quantity,
						  		increase totalEarnings   ( totalEarnings = quantity*price)

						  	- if quantity is not enough to sell
						  		ERROR : Quantity is not enough to sell

					  if it is not exist ;
					  	- ERROR : There is no product to sell
 */
