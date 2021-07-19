package V.Loops;

import java.util.Scanner;

public class PrintAsterisksNTimes_forLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        scan.close();
    }
}
/*
Given an int variable **n** print out **n** asterisks. So if n=5, five asterisks will be printed.

Example:
input: 1
output: *

Example:
input: 3
output: ***
 */
