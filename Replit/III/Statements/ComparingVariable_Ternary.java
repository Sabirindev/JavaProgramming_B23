package III.Statements;

import java.util.Scanner;

public class ComparingVariable_Ternary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number:");
        int num = scan.nextInt(), result = 0;

        result = (num>=5)? num:(num < 0)? num: -num;
        System.out.println(result);
    }
}
/*
Write an expression using the conditional operator (? :) that compares the value of the variable x to 5
and results in:

Display x if x is greater than or equal to 5
Display -x if x is less than 5

DO NOT USE IF STATEMENT or SWITCH CASE
 */
