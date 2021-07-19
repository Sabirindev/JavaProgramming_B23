package V.Loops;

import java.util.Scanner;

public class EachLetter_charAt_forLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        for (int i = 0; i < word.length(); i++) { // loop runs for number of the length of word
            char ch = word.charAt(i); // every single char from word will be added to ch (char data type) variable
                                    // but every period ch value will be changed, do ot mix it with string ;)
            System.out.println(ch); // every ch will printed one by one
        }
        scan.close();
    }
}
/*
Given a String, use a loop to print every character from the String on a new line.

Examples:
Input: hello
h
e
l
l
o

Input: zimbabwe
z
i
m
b
a
b
w
e

Input: wow!
w
o
w
!
 */
