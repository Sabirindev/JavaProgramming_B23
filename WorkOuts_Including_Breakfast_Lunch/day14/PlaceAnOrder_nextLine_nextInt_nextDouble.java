package day14;

import java.util.Scanner;

public class PlaceAnOrder_nextLine_nextInt_nextDouble {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the product name:"); // it might be multiple words
        String productName = scan.nextLine();

        System.out.println("Enter the price:");
        double price = scan.nextDouble();

        System.out.println("Enter the quantity");
        int quantity = scan.nextInt();

        double totalPrice = price * quantity;

        System.out.println("Enter your full name name");
        scan.nextLine(); // cleaning the memory
        String fullName = scan.nextLine();

        System.out.println(fullName+", "+"your order for "+quantity+" "+
                productName+" has been placed. Your total is $"+totalPrice);

        scan.close(); // closes the scanner classes
        //we can not use scanner object after this line
    }
}
/*
PlaceAnOrder task:
                Ask User to enter the prodcut name (multiple words)
                Ask the user to enter the price  (double)
                Ask the user to enter the quantity (int)
                Ask the user to enter their fullName name (String, single word)

            Print in the following format:
                Ex:
                    Input: "Apples" , 1.5, 5. "Luke"

                    Output:
                        Luke, your order for 5 Apples has been placed. Your total is 7.5.
 */
