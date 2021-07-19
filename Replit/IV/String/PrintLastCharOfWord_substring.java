package IV.String;

import java.util.Scanner;

public class PrintLastCharOfWord_substring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //System.out.println("Enter a word:");
        String word = scan.next();

        String LastCharOfWord = word.substring(word.length() - 1);
        System.out.println(LastCharOfWord);
        scan.close();
    }
}
/*
Write a program that will print out last letter of the word (string).

Ex:

Input: java

Output: a
 */
