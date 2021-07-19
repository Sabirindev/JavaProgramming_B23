package III.Statements;

import java.util.Scanner;

public class Calendar_monthNames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter month number:");
        int intMonth = scan.nextInt();
        String strigMonth = "";

        switch (intMonth) {
            case 1:
                strigMonth = "January";
                break;
            case 2:
                strigMonth = "February";
                break;
            case 3:
                strigMonth = "March";
                break;
            case 4:
                strigMonth = "April";
                break;
            case 5:
                strigMonth = "May";
                break;
            case 6:
                strigMonth = "June";
                break;
            case 7:
                strigMonth = "July";
                break;
            case 8:
                strigMonth = "August";
                break;
            case 9:
                strigMonth = "September";
                break;
            case 10:
                strigMonth = "October";
                break;
            case 11:
                strigMonth = "November";
                break;
            case 12:
                strigMonth = "December";
                break;
            default:
                strigMonth = "Invalid month number";
        }
        System.out.println(strigMonth);
    }
}
/*
Write a program that will print out month names by receiving a number.
Use Switch Statement. If an invalid month number is entered print "Invalid month number"

Example:

Display message: "Enter month number:"

input: 5

Display message: "May"
 */
