package day06;

import java.util.Scanner;

public class LeapYear {
    /*
    create a class named LeapYear, and write a program that can identify if the given is Leap Year,
     print true if it's leap year, otherwise print false
        Ex:
                year = 2020

            output:
                2020 is leap year: true

        Hint: if the number of years can be evenly divisible by 4, it's known as the leap year
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the year:");
        int year = scan.nextInt();

        boolean isLeapYear = year % 4 ==0;

        System.out.println(year+" is leap year: "+isLeapYear);

    }
}
