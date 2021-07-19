package day21_BranchingStatement_While_Loop;

import java.util.Scanner;

public class SumOfNumbersTillNegativeInput_While_if_else_if {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;

        while(true) {

            System.out.println("Enter a number:");
            int n = scan.nextInt();

            if(n < 0){ // if user entered negative number
                break; // exits the loop
            }else {
                sum += n;
            }

        }


        System.out.println("sum = " + sum);


        scan.close();
    }
}
