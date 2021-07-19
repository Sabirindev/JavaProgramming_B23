package III.Statements;

import java.util.Scanner;

public class VehicleRecall_if_else {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter vehicle's year:");
        int yearOfVehicle = scan.nextInt();
        String result = "";

        if (yearOfVehicle >= 1995 && yearOfVehicle <= 1998 ||
                yearOfVehicle >= 2001 && yearOfVehicle <= 2002 ||
                yearOfVehicle >= 2004 && yearOfVehicle <= 2006 ||
                yearOfVehicle >= 2015 && yearOfVehicle <= 2017) {
            result = "Your vehicle needs to be recalled!";
        } else {
            result = "Your vehicle is fine, enjoy!";
        }
        System.out.println(result);
    }
}
/*
SDET Motors Inc. is recalling all vehicles from model years 1995-1998, 2001-2002, 2004-2006 and 2015-2017.

In this assignment you will write a program that will find vehicle for recall.

If the year is in the provided range print: Your vehicle needs to be recalled!

If the year is fine print: Your vehicle is fine, enjoy!

Example:

Enter vehicle's year:
1996

Your vehicle needs to be recalled!
Enter vehicle's year:
1996

Your vehicle needs to be recalled!
Enter vehicle's year:
2018

Your vehicle is fine, enjoy!
 */
