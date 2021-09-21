package VII.Methods;

import java.util.Scanner;

public class RM_boolean_findErrorString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(isError(scan.nextLine()));
    }

    public static boolean isError(String line) {
        for (String each : line.split(" ")) {
            if (each.equals("error")) {
                return true;
            }
            break;
        }
        return false;
    }
}
/*
The isError method checks if the given String begins with error
The method will return true if the String starts with error otherwise it will return false

Examples:
isError("foo bar")
returns : false

isError("error foo bar")
returns : true

isError("error one two")
returns : true

isError("three four error")
returns : false
 */
