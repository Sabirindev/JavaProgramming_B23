package VI.Arrays;

import java.util.Scanner;

public class FindingMaxLengthInStringArray_ForLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String words[] = new String[5];
        int longestLength = words[0].length();
        String longestWord = "";
        for (int i = 0; i < words.length; i++) {
            words[i] = scan.next();
        }

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= longestLength) {
                longestLength = words[i].length();
                longestWord = words[i];

            }
        }
        System.out.println(longestWord);
        scan.close();
    }
}
/*
Given the array words find and print the word with the largest length.
 Assume that there are no 2 words with longest length

 Example:

words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]

Outputs: jaaaaavvaaaaaaaaaa
 */
