package day11_Switch;
                         /* This 'Calculator' task I write FOR FUN*/

import java.util.Scanner;

public class Calculator_with_Switch {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); //Scanner class

        System.out.print("Enter first number: ");
        double num1 = scan.nextDouble(); // entering firts number

        System.out.print("Enter second number: ");
        double num2 = scan.nextDouble(); //entering seconf number

        String result = ""; //empty value

        System.out.println("Select one of the given operators, please!" + "\n" + // list of operators
                "+ - Addition" + "\n" +
                "- - Subtraction" + "\n" +
                "* - Multiplication" + "\n" +
                "/ - Division" + "\n" +
                "% - Modulus");






        char operator = scan.next().charAt(0);    //entering operator (+,-,*,/,%)

        switch (operator) {// does NOT allow these primitives: long, float, double, Boolean

           case '+': result = num1 + " + " + num2 + " = " + (num1 + num2);
                break;
            case '-': result = num1 + " - " + num2 + " = " + (num1 - num2);
                break;
            case '*': result = num1 + " * " + num2 + " = " + (num1 * num2);
                break;
            case '/': result = num1 + " / " + num2 + " = " + (num1 / num2);
                break;
            case '%': result = num1 + " % " + num2 + " = " + (num1 % num2);
                break;

            default: result = "Something you entered is wrong"; //#,@ else


        }
        System.out.println(result);
    }
}
/*
    OUTPUT:
            Enter first number: 35
            Enter second number: 4
            Select one of the given operators, please!
            + - Addition
            - - Subtraction
            * - Multiplication
            / - Division
            % - Modulus
            /
            35.0 / 4.0 = 8.75
 */
