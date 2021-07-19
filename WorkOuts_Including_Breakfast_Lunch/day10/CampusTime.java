package day10;

import java.util.Scanner;

public class CampusTime {
    /*
            Campus time: User enters a time(hour in 24 hour format) and will be able to find out if the campus is open or not.
            Campus is open from 8 am(8) to 11 pm (23) If user enters a time within the open time they should see message: “open”
            but if the time entered is outside of operating hours they should see: “ closed”

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the time: ");
        int time = scan.nextInt();

        String openOrClosed = "";

        if (time > 0 && time <= 24) {
            if (time >= 8 && time <= 23) {
                openOrClosed = "Open";
            } else {
                openOrClosed = "Closed";
            }
        } else {
            openOrClosed = "Invalid Time";
        }
        System.out.println(openOrClosed);

    }
}
