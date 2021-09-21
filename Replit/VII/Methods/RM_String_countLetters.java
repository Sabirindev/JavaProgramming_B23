package VII.Methods;

import java.util.Scanner;

public class RM_String_countLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(countLetters(scan.nextLine()));

    }

    public static String countLetters(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

            if (result.contains("" + ch)) {
                continue;
            }
            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    count++;
                }
            }
            result += "" + count + ch;

        }
        return result;
    }
}
/*
Write a method countLetters that can count letters in a given string and
return a new string in the given format: number of letters + letter
Examples:

input: countLetters("aaabbcccc");
output: "3a2b4c"
 */
