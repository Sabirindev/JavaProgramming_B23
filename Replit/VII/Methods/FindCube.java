package VII.Methods;

import java.util.Scanner;

public class FindCube {
    public static void main(String[] args) {
        cube();
    }

    public static void cube() {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println(number * number * number);

    }
}
/*
Create a method called **cube**. It is a void method with no arguments.
Write all required code inside this method in order to read a number
from the console and then prints the cubed value of that number:

Example:

input: 5
output: 125

hint: cube of a number n = n^3 ->  n * n * n
 */
