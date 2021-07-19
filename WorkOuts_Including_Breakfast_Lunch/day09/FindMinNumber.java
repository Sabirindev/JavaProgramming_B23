package day09;

import java.util.Scanner;

public class FindMinNumber {
    /*
    write a program that can print out the minimum number between two numbers

        Ex:
            num1 = 20;
            num2 = 30;

            output:
                20 is the minimum number
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt(),
                num2 = scan.nextInt();

        if (num1 > num2) {
            System.out.println(num2 + " is the minimum number!");
        } else if (num1 < num2) {
            System.out.println(num1 + " is the minimum number!");
        } else
            System.out.println(num1 + " and " + num2 + " is equal!");

    }
}
