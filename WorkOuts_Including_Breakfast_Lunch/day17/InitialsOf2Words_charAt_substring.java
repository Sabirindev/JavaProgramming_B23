package day17;

import java.util.Scanner;

public class InitialsOf2Words_charAt_substring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String firstName = scan.next();
        System.out.println("Enter your last name:");
        String lastName = scan.next();

       /* //First way of SOLUTION
       String initial = firstName.substring(0,1)+"."+lastName.substring(0,1);
        System.out.println(initial.toUpperCase());*/

       /* //Second way of the SOLUTION
        String initial = firstName.charAt(0)+"."+lastName.charAt(0);
        initial.toUpperCase();// does not make it upper case unless it is assigned to
        initial = initial.toUpperCase();
        System.out.println(initial);*/

        //Third way of SOLUTION
        scan.nextLine();

        System.out.println("Enter your full name:");
        String fullName =scan.nextLine();

        firstName = fullName.substring(0,fullName.indexOf(" "));
        lastName = fullName.substring(fullName.indexOf(" ")+1);

        String initial = firstName.substring(0,1).toUpperCase() +"."+ lastName.substring(0,1).toUpperCase();
        System.out.println(initial);

        scan.close();



    }
}
/*
write a program that can return the initials of the user
            ex:
                cybertek
                school
            output:
                C.S
 */
