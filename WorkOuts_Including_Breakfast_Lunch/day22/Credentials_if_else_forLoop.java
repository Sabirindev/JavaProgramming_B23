package day22;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Credentials_if_else_forLoop {
    public static void main(String[] args) {
        String correctUerName = "Sabir";
        String correctPassWord = "SabirCybertek";

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username:");
        String userName = scan.next();

        System.out.println("Enter your passord");
        String passWord = scan.next();

        if (userName.equals(correctUerName) && passWord.equals(correctPassWord)){
            System.out.println("Logged In");
        }else {
            for(int i = 1; i <= 3; i++){//i: 1,2 ,3
                System.out.println("username or password is incorrect, please re-enter");
                System.out.println("Enter your username:");
                userName = scan.next();
                System.out.println("Enter your password:");
                passWord = scan.next();

                if(userName.equals(correctUerName) && passWord.equals(correctPassWord)){ // if the user entered credentials
                                                                                                // are correct
                    System.out.println("Logged In");
                    break; // exits the loop
                }

                if(i == 3){ // if user entered credentials are incorrect, and user already used all the (3)attempts
                    System.out.println("Your account is locked");
                    System.exit(0); // terminates the system
                }

            }

        }


        System.out.println("Hello Cybertek"); // should ONLY be displayed if the user logged in

        scan.close();

    }
}
/*
1. You are writing a code for the log-in function of the Cybertek Application, assume that your credentials are:
                    username: cybertek
                        password: cybertek12345

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to
                have three attempts to enter correct credentials and if all three attempts are failed,
                then print "Your account is lucked."

 */
