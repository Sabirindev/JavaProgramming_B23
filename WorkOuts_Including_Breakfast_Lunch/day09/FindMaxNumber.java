package day09;

import java.util.Scanner;

public class FindMaxNumber {
    /*
    write a program that can print out the maximum number between two different numbers
            Ex:
                num1 = 20;
                num2 = 30;

            output:
                    30 is the maximum number
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt(),
                num2 = scan.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " is the maximum number!");
        } else if (num1 < num2) {
            System.out.println(num2 + " is the maximum number!");
        } else
            System.out.println(num1 + " and " + num2 + " is equal!");
    }
}
