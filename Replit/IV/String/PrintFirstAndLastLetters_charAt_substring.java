package IV.String;

import java.util.Scanner;

public class PrintFirstAndLastLetters_charAt_substring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //System.out.println("Enter a word:");
        String word = scan.next();

        String FirstAndLAstLettersOfWord = word.charAt(0) + word.substring(word.length() - 1);
        System.out.println(FirstAndLAstLettersOfWord);
        scan.close();
    }
}
/*
Write a program that will print out first and last letters together.

Input: adobe

Output: ae
 */
