package VII.Methods;

import java.util.Scanner;

public class RM_String_wordCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(wordCount(scan.nextLine()));
    }

    public static int wordCount(String words) {
        return words.split(" ").length;
    }
}
/*
wordCount accepts String and returns how many words are in the given String

Example:

wordCount("foo bar")
returns 2

wordCount("one two three")
returns 3

wordCount("bla")
returns 1

Hint: look at spaces
 */
