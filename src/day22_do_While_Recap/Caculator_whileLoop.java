package day22_do_While_Recap;

import java.util.Scanner;

public class Caculator_whileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1;
        int num2;
        char operator;
        String answer = "";

        while( !answer.equals("no") ){ // if the answer is not No
            System.out.println("Enter two numbers:");
            num1 =  scan.nextInt();
            num2 = scan.nextInt();

            System.out.println("Enter a math operator:");
            operator = scan.next().charAt(0);

            if(operator =='-'){
                System.out.println("Subtraction: " + (num1-num2) );
            }else if(operator =='+'){
                System.out.println("Addition: "+ (num1+num2)  );
            }else if(operator == '*'){
                System.out.println("Multiplication: " + (num1*num2) );
            }else if(operator == '/'){
                System.out.println("Division: "+  (num1/num2));
            }else{
                System.out.println("Invalid Operator");
            }

            System.out.println("Do you want to continue?");
            answer = scan.next().toLowerCase(); //Maybe

            while(  !(answer.equals("yes") || answer.equals("no"))  ) { // to make sure user will only enters yes or no
                System.out.println("Invalid Entry, Please re-enter");
                System.out.println("Do you want to continue?");
                answer = scan.next().toLowerCase();
            }

        }
    }
}
/*
1. write a program that will ask user to enter two numbers and calculates the sum of those two numbers.
 then it asks the user if he/she wants to continue
                    if the answer is yes, repeat the whole process again
 */
