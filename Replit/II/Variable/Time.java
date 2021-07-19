package II.Variable;

import java.util.Scanner;

public class Time {
    /*
    In this assignment, you will write code to put together time of day.

Like this: 12:24:33 PM

1. Declare variables: hour, minute, second that can hold int values.

   Declare amOrPm variable that can hold a String ("AM" or "PM")

2. Instructor will set different values to your variables

3. Using the variables and concatenation, print values in the format mentioned above.
     */

    public static void main(String[] args) {
        int hour, minute, second;
        String amOrPm;

        Scanner scan = new Scanner(System.in);
        hour = scan.nextInt();
        minute = scan.nextInt();
        second = scan.nextInt();
        amOrPm = scan.next();

        System.out.println("\'"+hour+":"+minute+":"+second+" "+amOrPm+"\'");

    }

}
