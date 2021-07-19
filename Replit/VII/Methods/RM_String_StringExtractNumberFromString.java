package VII.Methods;

import java.util.Scanner;

public class RM_String_StringExtractNumberFromString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(extractNum(in.next()));
    }

    public static String extractNum(String s){
        String sabir = "";
        for (int i = 0; i < s.length(); i++) {
           if (s.charAt(i) >= '0' && s.charAt(i)<='9' ){
            sabir += ""+s.charAt(i);
           }
        }
        return sabir;
    }
}
/*
Create a method extractNum that cleans any non number string from a string it gets and returns the clean string

input:

s (string) - given String

return: string: a String of numbers only

Example:

extractNum("aa2aa3") ==> 23
extractNum("aa2") ==> 2
extractNum("aa10aa") ==> 10
extractNum("aa!!%$#.10aa") ==> 10

hint:

you can use: Character.isDigit() or ascii values
 */
