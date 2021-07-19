package II.Variable;

import java.util.Scanner;

public class SumOfNumbers_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 3 numbers:");
        int num1 = scan.nextInt(), num2 = scan.nextInt(),
                num3 = scan.nextInt(), sum = 0;
        sum = num1 + num2 + num3;
        System.out.println("Sum of numbers: "+sum);
    }
}
/*
In this assignment you will create a Scanner object and ask user to enter 3 number inputs.

Declare integer variables num1, num2, num3, sum.

Create a Scanner object named scan.

Flow:

-Display prompt "Enter 3 numbers:"

-Using scanner object let user input 3 numbers

-Add 3 numbers and assign to sum variable

-Print "Sum of numbers: ValueOfSum"
 */
