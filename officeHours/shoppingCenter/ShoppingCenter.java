package shoppingCenter;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingCenter {
    public static void main(String[] args) {

        // CHECK REPOSITORY
        System.out.println("===== CHECK REPOSITORY ===");
        System.out.println(StockManagement.electronics);
        System.out.println(StockManagement.clothes);

        // CREATE CATEGORY CLASS WITH PRODUCTS
        System.out.println("===== CREATE CATEGORY CLASS WITH PRODUCTS  ===");
        Category catClothes=new Category("Clothes",StockManagement.clothes);
        System.out.println("catClothes = " + catClothes);

        // CREATE CATEGORY CLASS WITHOUT PRODUCTS
        System.out.println("===== CREATE CATEGORY CLASS WITHOUT PRODUCTS  ===");
        Category catElectronics=new Category("Electronics");
        System.out.println("catElectronics = " + catElectronics);


        // ADD FIRST PRODUCT FOR ELECTRONICS
        System.out.println("===== ADD FIRST PRODUCT FOR ELECTRONICS  ===");
        catElectronics.addProduct(new Product("USB Cable",100,3));
        System.out.println("catElectronics = " + catElectronics);


        // ADD SAME PRODUCT FOR ELECTRONICS
        System.out.println("===== ADD SAME PRODUCT FOR ELECTRONICS  ===");
        catElectronics.addProduct(new Product("USB Cable",100,3));
        System.out.println("catElectronics = " + catElectronics);


        // ADD SAME PRODUCT FOR ELECTRONICS WITH DIFFERENT PRICE
        System.out.println("===== ADD SAME PRODUCT FOR ELECTRONICS WITH DIFFERENT PRICE  ===");
        catElectronics.addProduct(new Product("USB Cable",100,5));
        System.out.println("catElectronics = " + catElectronics);

        // ADD LIST OF PRODUCT FOR ELECTRONICS
        System.out.println("===== ADD LIST OF PRODUCT FOR ELECTRONICS   ===");
        catElectronics.addProduct(StockManagement.electronics);
        System.out.println("catElectronics = " + catElectronics);

        // ADD LIST OF PRODUCT FOR ELECTRONICS WITH SAME PRODUCT OR DIFFERENT PRICE
        System.out.println("===== ADD LIST OF PRODUCT FOR ELECTRONICS WITH SAME PRODUCT OR DIFFERENT PRICE  ===");
        ArrayList<Product> addElectronics=new ArrayList<>();
        addElectronics.addAll(Arrays.asList(
                new Product("USB Cable",100,3),
                new Product("USB Cable",100,5),
                new Product("Battery",100,10)
        ));
        catElectronics.addProduct(addElectronics);
        System.out.println("catElectronics = " + catElectronics);



        /*
        // SELL ONE PRODUCT FROM ELECTRONICS
        System.out.println("==========SELL ONE PRODUCT FROM ELECTRONICS===========");
        catElectronics.sellProduct(new Product("HeadPhone",14,200));
        System.out.println("electronics = " + catElectronics);
        System.out.println("Category.totalEarning = " + Category.totalEarning);
        // SELL ONE PRODUCT FROM ELECTRONICS OUT OF STOCK
        System.out.println("==========SELL ONE PRODUCT FROM ELECTRONICS OUT OF STOCK===========");
        catElectronics.sellProduct(new Product("Watch",14,200));
        System.out.println("electronics = " + catElectronics);
        System.out.println("Category.totalEarning = " + Category.totalEarning);
        // SELL ONE PRODUCT FROM ELECTRONICS
        System.out.println("==========SELL ONE PRODUCT FROM ELECTRONICS===========");
        catElectronics.sellProduct(new Product("HeadPhone",15,200));
        System.out.println("electronics = " + catElectronics);
        System.out.println("Category.totalEarning = " + Category.totalEarning);
        // SELL ONE PRODUCT FROM ELECTRONICS
        System.out.println("==========SELL ONE PRODUCT FROM ELECTRONICS===========");
        catElectronics.sellProduct(new Product("HeadPhone",14,200));
        System.out.println("electronics = " + catElectronics);
        System.out.println("Category.totalEarning = " + Category.totalEarning);
        // SELL PRODUCTS FROM ELECTRONICS
        System.out.println("==========SELL PRODUCTS FROM ELECTRONICS===========");
        ArrayList<Product> sellElectronics=new ArrayList<Product>();
        sellElectronics.addAll(Arrays.asList(new Product("HeadPhone",14,150),
                new Product("HeadPhone",14,150),
                new Product("HeadPhone",14,155),
                new Product("Battery",10,5)))  ;
        catElectronics.sellProduct(sellElectronics);
        System.out.println("electronics = " + catElectronics);
        System.out.println("Category.totalEarning = " + Category.totalEarning);
         */



    }
}
/*
==	Create a class called ShoppingCenter

			- Create Categories ArrayList
			- Create category Objects to add Products/sellProducts
			- Add All category Objects into the categories Arraylist
 */
