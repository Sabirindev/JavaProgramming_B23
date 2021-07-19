package VII.Methods;

import java.util.Scanner;

public class RM_String_reverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(reverse(scan.nextLine()));

    }
    public static String reverse(String input){
        String result ="";
        for (int i = input.length()-1; i >= 0; i--) {
            result += input.charAt(i);
        }
        return result;
    }
}
/*
The reverse method will reverse the given String
Examples:

reverse("foo") ==> "oof"
reverse("student") ==> "tneduts"
 */
