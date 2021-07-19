package VI.Arrays;

import java.util.Scanner;

public class PrintFirstAndLastCharElementsOfArr_substring_charAt_forLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String words[]= {scan.nextLine(), scan.nextLine(), scan.nextLine(), scan.nextLine(), scan.nextLine()};

        String firstLast = "";
        for (int i = 0; i < words.length; i++) {
            firstLast =words[i].charAt(0) + words[i].substring(words[i].length()-1);
            System.out.println(firstLast);
        }


    }
}
/*
Given a String array words, iterate through each word and print first
and last letter of each element in separate lines.

Example:

```
words → ["hello", "why", "by", "apple" , "note"]

print:
ho
wy
by
ae
ne
 */
