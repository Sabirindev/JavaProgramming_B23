package day19_ForLoop;

import java.util.Scanner;

public class SumOfTenGivenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum =0;

        for (int i = 1; i<=10; i++){
            System.out.println("Enter your "+i+". number: ");
            int number = scan.nextInt();

            sum += number;
        }
        System.out.println("Sum = "+ sum);
    }
}
/*
6. ask user to enter a number 10 times . find the sum of 10 numbers
 */
