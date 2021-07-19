package day09_IfStatements;


import java.util.Scanner;

public class NameOfDayInWeek {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please, Enter integer number between 1-7 : ");
        int numberOfDay = scan.nextInt();

        if (numberOfDay == 1) {
            System.out.println("Monday");
        } else if (numberOfDay == 2) {
            System.out.println("Thuesday");
        } else if (numberOfDay == 3) {
            System.out.println("Wednesday");
        } else if (numberOfDay == 4) {
            System.out.println("Thursday");
        } else if (numberOfDay == 5) {
            System.out.println("Friday");
        } else if (numberOfDay == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Sunday");
        }
    }

}
/*
Please, Enter integer number between 1-7 : 6
Saturday
 */
