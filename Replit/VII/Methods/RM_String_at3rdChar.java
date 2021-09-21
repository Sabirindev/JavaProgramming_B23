package VII.Methods;

import java.util.Scanner;

public class RM_String_at3rdChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(at3(scan.next(),scan.next()));

    }
    public static String at3(String target, String word){
        String result ="";
        for (int i = 0; i < target.length(); i++) {
            if (i==3){
                result += word;
            }
            result += target.charAt(i);

        }
        return result;
    }
}
/*
at3 accepts two strings and returns a string.
The first string is the one that will be manipulated.
At the 3rd char position of target you will insert the word argument.

Examples:

at3("longword","foo"
return: "lonfoogword"

at3("blabla","a")
return: "blaabla"
 */
