package day20_BranchingStatements_Break_Continue;

import java.util.Scanner;

public class sumUntilUserEnterNegativeInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers:");

        for (int i = 0; i >= 0; i++) {
            System.out.println("number1:");
            int num1 = scan.nextInt();
            System.out.println("number2:");
            int num2 = scan.nextInt();
            System.out.println("Sum = "+(num1+num2));

            if (num1< 0 || num2 < 0){
                System.out.println("User entered = "+ num1 +" And " + num2 );
                break;
            }
        }
        scan.close();
    }
}
/*
4. Write a program that calculates the sum of numbers entered by the user until user enters a negative number.

            hint: you need an infinite loop
 */
