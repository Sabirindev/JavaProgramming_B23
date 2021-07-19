package day15_String_Method;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first Name");
        String firstName = scan.next();


        System.out.println("Enter your last name:");
        String lastName = scan.next();

        scan.close(); // close Scanner class

        char f = firstName.charAt(0),
                l = lastName.charAt(0);
        String initial = f+"."+l+" is initial of "+ firstName+" "+lastName;
        System.out.println(initial);


    }
}
