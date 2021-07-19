package III.Statements;

import java.util.Scanner;

public class VendingMachine_nextInt_method {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter cents:");
        int cents = scan.nextInt(),
                quarters, dimes, nickels, pennies;
        String result;
        if (cents > 0 && cents < 100) {
            quarters = cents / 25;
            dimes = (cents % 25) / 10;
            nickels = ((cents % 25) % 10) / 5;
            pennies = cents%5;//((cents % 25) % 10) % 5;

            result = "Your change is " + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, " +
                    "and " + pennies + " pennies";
        } else {
            result = "Invalid cents amount";
        }

        System.out.println(result);


    }
}
/*
Write a program that will determine the change given from the vending machine.
The program will accept the cents amount and output the change in quarters, dimes, nickels, and pennies.

The given cents value should be more than 0 and less than 100.
 If the given cents is not in the range print "Invalid cents amount" and there should be no other output after
In valid cases print the change in this format: Your change is x quarters, x dimes, x nickels, and x pennies

Enter cents:
95
Your change is 3 quarters, 2 dimes, 0 nickels, and 0 pennies
 */
