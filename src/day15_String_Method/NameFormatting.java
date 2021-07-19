package day15_String_Method;

import java.util.Scanner;

public class NameFormatting {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter your first name:");

        String firstName = scan.nextLine().trim();
        String firstName1 = firstName.substring(0,1).toUpperCase() +
                            firstName.substring(1).toLowerCase();
        //System.out.println(firstName1);

        System.out.println("Enter your last name");
        String lastName = scan.nextLine().trim();
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        String fullName = firstName1+" "+lastName;

        System.out.println(fullName);

    }
}
