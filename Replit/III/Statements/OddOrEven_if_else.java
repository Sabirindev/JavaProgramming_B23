package III.Statements;

import java.util.Scanner;

public class OddOrEven_if_else {
    /*
    Using conditional statements, check if number is odd or even.
    Please follow the below examples and print message accordingly:

Enter a number:
10

10 is even
Enter a number:
10

10 is even
Enter a number:
33

33 is odd
Enter a number:
33

33 is odd
Enter a number:
0

0 is even
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = scan.nextInt();

        if (a % 2 != 0) {
            System.out.println(a + " is odd");
        } else {
            System.out.println(a + " is even");
        }


    }
}
