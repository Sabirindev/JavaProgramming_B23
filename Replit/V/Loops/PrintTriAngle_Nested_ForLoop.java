package V.Loops;

import java.util.Scanner;

public class PrintTriAngle_Nested_ForLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        System.out.println("***** Nested For Loop *****");
        for (int a = 0; a < n; a++) {
            for (int b = 0; b < a+1; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scan.close();
    }
}
/*
Write a program that will create a triangle of asterisks based on size **n**.

Example:
input: 5

output:
*
**
***
****
*****

Example:

input: 3

output:
*
**
***
 */
