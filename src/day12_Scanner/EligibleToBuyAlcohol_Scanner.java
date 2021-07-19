package day12_Scanner;

import java.util.Scanner;

public class EligibleToBuyAlcohol_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = scan.nextInt();

        boolean isEligible = age>=21;

        if (isEligible){
            System.out.println("You are eligible");
        }else{
            System.out.println("You are not eligible");
        }
    }
}
