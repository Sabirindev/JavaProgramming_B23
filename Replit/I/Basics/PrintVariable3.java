package I.Basics;

import java.util.Scanner;

public class PrintVariable3 {
    /*
    Given two variables num and cost that have been declared and given values,
    write a statement to print the values.

Ex:

Input: 2 5

Output: num= 2 cost= 5.0
     */
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);

        System.out.print("Enter the first number:");
        int num = a.nextInt();

        System.out.print("Enter the second number:");
        double cost = a.nextDouble();

        System.out.print("num= "+num+"\n"+"cost= "+cost);

    }
}
/*
             OutPut:

      Enter the first number:5
      Enter the second number:13
      num= 5
      cost= 13.0

   */
