package day17_StringMethods3;

import java.util.Scanner;

public class ValidOrNotValidEmail_endsWith {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your email address:");
        String email = scan.next();

        if (email.endsWith("@gmail.com") || email.endsWith("@yahoo.com")||
        email.endsWith("@mail.ru")){
            System.out.println(email+" is valid email address");
        }else {
            System.out.println(email+" is not valid email address");
        }
        /*

         */
        scan.close();
    }
}
/*
1. write a program to verify if the gmail is valid
            requirments:
                    a valid gmail account should end with @gmail.com
 */
