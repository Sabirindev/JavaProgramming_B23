package I.Basics;

import java.util.Scanner;

public class PrintVariable5 {
    /*

    Given two variables first and second with values, write a statement that will print the values in a single line.

Ex:

Input: 55 123

Output: first is 55 and second is 123

Input: -124 -500

Output: first is -124 and second is -500

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = scan.nextInt(),
                second = scan.nextInt();

        System.out.print("first is "+first+" and "+"second is "+second);
    }
}
