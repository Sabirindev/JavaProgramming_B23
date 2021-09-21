package VII.Methods;

import java.util.Scanner;

public class RM_isEven {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println(isEven(in.nextInt()));
    }
    public static boolean isEven(int n){
        boolean num = (n%2==0)?true:false;
        return num;
    }
}
/*
isEven accepts a number and checks if it is even.
If the given number is even return true, otherwise return false.

Examples:

isEven(1) --> false
isEven(1) --> false
isEven(8) --> true
 */
