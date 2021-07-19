package day15_String_Method;

import java.util.Scanner;

public class StringClaculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter first number:");
        double num1 = scan.nextDouble();

        System.out.println("Enter a math operator");
        char mathOperator = scan.next().charAt(0);

        System.out.println("Enter your second umber");
        double num2 = scan.nextDouble();

        double result = 0;

        switch (mathOperator){
            case '-':
                result = num1 - num2;
                break;

            case '+':
                result = num1 + num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                result = num1/num2;
                break;

            default:
                System.err.println("Invalid Operator");
        }

        System.out.println("result = " + result);



    }
}
