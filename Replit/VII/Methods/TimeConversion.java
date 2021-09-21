package VII.Methods;

import java.util.Arrays;
import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeConversion(scan.nextLine());
    }

    public static void timeConversion(String s) {
        String time[] = s.split(":"),

                //07:05:45PM
                //s1 s2  s3
                s1 = time[0], // 07
                s2 = time[1],  // 05
                s3 = time[2],  // 45PM
                result = "";
        //System.out.print(s1+" "+s2+" "+s3);
        int hour = Integer.parseInt(s1); // first element of string array is converted to int value and
                                            // assigned to int hour varibale
        if (s3.toUpperCase().contains("AM")) {
            if (s1.equals("12")){
                result = "00" + ":" + s2 + ":" + s3.substring(0,s3.length()-2);
            } else{
                result = s1 + ":" + s2 + ":" + s3.substring(0,s3.length()-2);
            }
        }
        if (s3.toUpperCase().contains("PM")) {
            if (hour == 12) {
                result = hour + ":" + s2 + ":" + s3.toUpperCase().replaceFirst("PM","");
            } else {
                hour = hour + 12;
                result = hour + ":" + s2 + ":" + s3.substring(0,s3.length()-2);
            }
        }
        System.out.println(result);
    }
}
/*
Given a time in 12 hour AM/PM format, convert it to military (24-hour) time.

Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock.
Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.

The **timeConversion** method should convert and print the given number (String argument)

Input: 07:05:45PM
Output: 19:05:45

Input: 07:15:55AM
Output: 07:15:55
 */
