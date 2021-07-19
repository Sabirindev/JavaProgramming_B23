package day13;

import java.util.Scanner;

public class CentsToDollar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Cents amount:");
        int cents = scan.nextInt(),dollar = cents/100, change = cents%100;
        String result = "";

        if (cents > 0) {
            if (cents % 100 == 0) {
                result = cents + " cents equal to: " + dollar + " dollars";
            } else {
                result = cents + " cents equal to: " + dollar + " dollars and " + change + " cents";
            }
        }else{
            result = " Invalid amount entered";
        }
        System.out.println(result);



    }
}
/*
Write a program that can convert cents to dollars, if there is any remainder include them in the result as cents
            Ex:
                Enter cents
                225

                output:
                225 cents equal to: 2 dollars and 25 cents

                Enter cents
                300 cents equal to: 3 dollars

 */
