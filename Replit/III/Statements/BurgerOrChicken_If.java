package III.Statements;

import java.util.Scanner;

public class BurgerOrChicken_If {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String product = scan.next();
        double price = 0;

        if (product.equalsIgnoreCase("burger") || product.equalsIgnoreCase("chicken")){
            price = 10;
        }else if (product.equalsIgnoreCase("soda")){
            price = 2;
        }else if (product.equalsIgnoreCase("fries")){
            price = 3.5;
        }else {
            System.out.println("invalid Item");
        }
        System.out.println(price);
    }


}
/*
A fast food company has two main order types, burger meal and chicken meal.

Both have the same prices, so if a cashier enters "burger" or "chicken " he will get the same price of 10.0.

If the order is burger price is 10.0
If the order is chicken price is 10.0
If the order is soda price is 2.0
If the order is fries price is 3.5
hint: or operator in java is ||

Examples:

burger

10.0
burger

10.0
chicken

10.0
chicken

10.0
soda

2.0
 */
