package IV.String;

import java.util.Scanner;

public class PrintFirstCharOfWord_charAt_OR_substring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next(),firstCharOfWord = "";

        firstCharOfWord = word.substring(0,1);
        System.out.println(firstCharOfWord);

    }
}
/*
Write a program that will print out the first character of the word.

Ex:

Input: jump
Input: jump
Output: j
 */
