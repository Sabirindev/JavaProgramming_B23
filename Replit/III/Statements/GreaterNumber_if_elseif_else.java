package III.Statements;

import java.util.Scanner;

public class GreaterNumber_if_elseif_else {

    /*
    Use an if statement to determine if a or b is bigger. Then print:

$number is greater

Examples:

a=1
b=2

output:
2 is greater
a=1
b=2

output:
2 is greater
a=5
b=7

output:
7 is greater
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scan.nextInt();

        System.out.print("Enter second number: ");
        int b = scan.nextInt();

        if (a > b) {
            System.out.println(a + " is greater");
        } else if (a == b) {
            System.out.println(a + " and " + b + " is equal");
        } else {
            System.out.println(b + " is greater");
        }
    }
}
