package shoppingCenter;

import java.util.ArrayList;
import java.util.Arrays;

public class StockManagement {
    public static ArrayList<Product> electronics=new ArrayList<>();
    public static ArrayList<Product> clothes=new ArrayList<>();

    static {

        electronics.addAll(Arrays.asList(
                new Product("Phone",40,800),
                new Product("HeadPhone",14,150),
                new Product("Mouse",43,50),
                new Product("Keyboard",60,70)
        ));


        clothes.addAll(Arrays.asList(
                new Product("Jackets",40,40),
                new Product("Hats",100,10),
                new Product("Dress",43,50)
        ));

    }
}
/*
==	Create a class called StockManagement
			- Create an Arraylist called products (Product)

			use static block
				- to initialize products
 */
