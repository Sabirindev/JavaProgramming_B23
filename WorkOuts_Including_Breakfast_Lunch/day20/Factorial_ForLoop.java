package day20;

import java.util.Scanner;

public class Factorial_ForLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");

        int number = scan.nextInt(),
                factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println(number+"! = " + factorial);
        scan.close();
    }
}
/*
Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120  ( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
 */
