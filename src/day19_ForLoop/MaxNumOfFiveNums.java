package day19_ForLoop;

import java.util.Scanner;

public class MaxNumOfFiveNums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your 1. number: ");
        int number = scan.nextInt();
        int maxNum = number;

        for (int i = 2; i <= 5; i++) {
            System.out.println("Enter your " + i + ". number: ");
            number = scan.nextInt();
            if (maxNum > number) {
                maxNum = maxNum;
            } else {
                maxNum = number;
            }
        }
        System.out.println("Max Number = " + maxNum);
        scan.close();
    }
}
/*
7. ask user to enter a number for 5 times,
then return the maximum number

 */
