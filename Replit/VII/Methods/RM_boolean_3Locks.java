package VII.Methods;

import java.util.Scanner;

public class RM_boolean_3Locks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(threeLocks(scan.nextBoolean(),scan.nextBoolean(),scan.nextBoolean()));
    }
    public static boolean threeLocks(boolean a, boolean b, boolean c){
        if (a && b || c){
            return true;
        }
        return false;
    }
}
/*
threeLocks accepts 3 booleans and returns a boolean.
It returns true only if both a and b are true or c is true.
Hint: See truth table
 */
