package day21;

import java.util.Scanner;

public class MultiplyTwoNumbersWithoutUsingMultpleOperator {
    public static void main(String[] args) {
        int num1 = new Scanner(System.in).nextInt();
        int num2 = new Scanner(System.in).nextInt();
        int result = 0;

        if (num1 < 0 || num2 < 0) {
            System.out.println("Entered number should be positive");
            System.exit(0); //since exit runining, then the codes stop executing
        }

        for (int i = 0; i < num1; i++) {
            result += num2;
        }
        System.out.println(result);
    }
}
/*
1. write a program that can multiply two numbers without using * operator
 */
