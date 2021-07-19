package VII.Methods;

import java.util.Scanner;

public class PrintNext3Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number");
        int n = scan.nextInt();
        next3(n);
        scan.close();
    }

    public static void next3(int num){
        System.out.println("next 3 are:");
        for (int i = 0; i <3 ; i++) {
            System.out.print(++num+" ");
        }

    }
}
/*
Create a method called **next3** . This method has an int argument
and prints the next 3 numbers after that number.
Call the method from main method and pass `num` to it.

example:

enter number
1
next 3 are:
2 3 4

(put a space between numbers)
 */
