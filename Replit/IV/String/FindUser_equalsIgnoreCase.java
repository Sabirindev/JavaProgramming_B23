package IV.String;

import java.util.Scanner;

public class FindUser_equalsIgnoreCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter full name:");
        String fullName = scan.nextLine(),
                result = "";

        if (fullName.equalsIgnoreCase("Max Payne") ||
                fullName.equalsIgnoreCase("Alan Wake")){
            result = "User found!";
        }else {
            result = "User not found!";
        }
        System.out.println(result);
    }
}
/*
Write a program that will look up a user.

Assume that you have only 2 users: Max Payne and Alan Wake.
First, ask user to enter full name. Display message: "Enter full name:". Then take input from user.
 If name is equals to either "Max Payne" or "Alan Wake", display message: "User found!".
 Otherwise, display message: "User not found!". Please make your search case insensitive!

Example:

Display message: Enter full name:
Display message: Enter full name:
input: Max Payne
input: Max Payne
Display message: User found!
 */
