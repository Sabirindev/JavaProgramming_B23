package IV.String;

import java.util.Scanner;

public class HasAJava_substring_equalsIgnoreCase {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        boolean exist = word.length() >=4;


        if (exist) {
            if (word.substring(0, 4).equalsIgnoreCase("java") ||
                    word.substring(1, 5).equalsIgnoreCase("java")) {
                System.out.println("true");

            } else {
                System.out.println("false");
            }
        }else{
            System.out.println("false");

        }

    }
}
/*
Given a string word, print true if "java" appears starting at index 0 or 1 in the string,
such as with "javaxxx" or "xjavaxx" but not "xxjavaxx". The string may be any length, including 0.

Example:

input: javapython

output: true
input: javapython

output: true
input: cjavac++

output: true
input: cjavac++

output: true
input: c#javaruby

output: false
 */
