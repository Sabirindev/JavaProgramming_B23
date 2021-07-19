package day22_do_While_Recap;

import java.util.Scanner;

public class KeepEnterinUserAndPassTillEnyeringUncorrect_doWhile {
    public static void main(String[] args) {
        String correctUerName = "Sabir";
        String correctPassWord = "SabirCybertek";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username:");
        String userName = scan.next();

        System.out.println("Enter your passord");
        String passWord = scan.next();

        if (userName.equals(correctUerName) && passWord.equals(correctPassWord)) {

            do {

                System.out.println("Enter your username:");
                userName = scan.next();

                System.out.println("Enter your passord");
                passWord = scan.next();
            } while (userName.equals(correctUerName) && passWord.equals(correctPassWord));
            System.out.println("User name or Password is invalid");
        } else {
            System.out.println("User name or Password is invalid");
        }

    }
}
