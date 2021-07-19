package day19_ForLoop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MinNumOfFiveNums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your 1. number: ");
        int number = scan.nextInt();
        int minNum = number;

        for (int i = 2; i <= 5; i++) {
            System.out.println("Enter your " + i + ". number: ");
            number = scan.nextInt();

            if (minNum >= number) {
                minNum = number;
            } else {
                minNum = minNum;
            }
        }
        System.out.println("Min Number = " + minNum);
        scan.close();
    }
}
/*
8. ask user to enter a number for 5 times,
then return the minimum number
 */
