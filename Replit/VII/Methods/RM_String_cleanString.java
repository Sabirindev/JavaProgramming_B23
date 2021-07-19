package VII.Methods;

import java.util.Scanner;

public class RM_String_cleanString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(clean(scan.nextLine(), scan.next()));

    }

    public static String clean(String text, String badWord) {
        String result = "";
        for (String each : text.split(" ")) {
            if (each.equals(badWord)) {
                continue;
            }
            result += each + " ";
        }
        return result.trim();
    }
}
/*
This method accept two strings (text and badWord) and returns a string.
The method will take out all the occurrences of badWord in the text.

Example:

clean ("one two three","two")
returns "one three"

clean ("foo bar","foo")
returns "bar"

clean ("he said bla bla bla","bla")
returns "he said"
 */
