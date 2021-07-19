package V.Loops;

import java.util.Scanner;

public class Factorial_forLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
        scan.close();
    }
}
/*
In mathematics a factorial of a positive integer n, denoted by n!,
is the product of all positive integers less than or equal to n.
Calculate factorial and output result to the console.

Example:

input: 5
output: 120

5 * 4 * 3 * 2 * 1
 */
