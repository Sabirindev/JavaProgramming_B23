package day18;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class DigitLetterSpecialChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");

        String word = scan.next();

        boolean isDigit = word.charAt(0) >='0' && word.charAt(0) <='9';
        boolean isSpecialChar = word.charAt(0)>='!' && word.charAt(0) <= '@';
        boolean isUpperCase = word.charAt(0) >= 'A' && word.charAt(0) <='Z';
        boolean isLowerCase = word.charAt(0)>= 'a' && word.charAt(0)<='z';
        String result ="";

        if (isDigit){
            result = "first character is digit";
//        }else if (isUpperCase){
//            result = "first character is uppercase letter";
//        }else if (isLowerCase){
//            result = "first character is lowercase letter";
        }
           else {
            result = "first character is special character";
        }
        System.out.println(result);

        scan.close();
    }
}
/*
3. Ask user to enter a word,
        if the word starts with digits, print "first character is digit"
        if the word starts with uppercase letters, print "first character is lowercase letter"
        if the word starts with lowercase letters, print "first character is uppercase letter"
        if the word starts with special characters, print "first character is special character"

 */
