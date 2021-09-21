package VII.Methods;

import java.util.Scanner;

public class RM_String_removeFirstChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(removeFirst(scan.next()));
    }
    public static String removeFirst(String target){
        return target.substring(1);
    }
}
/*
The method accepts a string and returns a string without the first character
Example:

removeFirst("aaa")
returns "aa"
 */
