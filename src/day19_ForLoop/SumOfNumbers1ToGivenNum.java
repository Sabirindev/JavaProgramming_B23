package day19_ForLoop;

import java.util.Scanner;

public class SumOfNumbers1ToGivenNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inputNum = scan.nextInt(),sum = 0;
        for (int i = 1; i <=inputNum; i++){
            sum += i;
        }
        System.out.println(sum);

    }
}
/*
5. write a program that can calculate the sum of all numbers between 1 to any given number
            ex:
                input: 100
                output: 5050

                input: 50
                output: 1275

                input : 200
                output : 20100
 */
