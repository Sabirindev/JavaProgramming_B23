package day13_Scanner_Methods;

import java.util.Scanner;

public class NextLine_Method {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); //Master

        System.out.println("******Next() Method*********************");
       /* System.out.println("Enter your job title:");
        String jobTitle = scan.next(); //Scrum

        scan.next(); // this is gona keep value (Master)

        System.out.println("Enter your gender:");
        String gender = scan.next(); //we can input our value of gender

        System.out.println("jobTitle = "+jobTitle);
        System.out.println("gender = "+gender);
        */

        System.out.println("******NextLine() Method*********************");
        System.out.println("Enter your job title:");
        String jobTitle2 = scan.nextLine();

        System.out.println("jobTitle2 = " + jobTitle2);



    }
}
