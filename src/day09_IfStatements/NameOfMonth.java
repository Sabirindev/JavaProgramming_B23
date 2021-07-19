package day09_IfStatements;

import java.util.Scanner;

public class NameOfMonth {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Please, Enter integer number between 1-12 : ");
        int numberOfMonth = scan.nextInt();

        if (numberOfMonth == 1) {
            System.out.println("January");
        } else if (numberOfMonth == 2) {
            System.out.println("February");
        } else if (numberOfMonth == 3) {
            System.out.println("March");
        } else if (numberOfMonth == 4) {
            System.out.println("April");
        } else if (numberOfMonth == 5) {
            System.out.println("May");
        } else if (numberOfMonth == 6) {
            System.out.println("June");
        } else if (numberOfMonth == 7) {
            System.out.println("July");
        } else if (numberOfMonth == 8) {
            System.out.println("August");
        } else if (numberOfMonth == 9) {
            System.out.println("September");
        } else if (numberOfMonth == 10) {
            System.out.println("October");
        } else if (numberOfMonth == 11) {
            System.out.println("November");
        } else {
            System.out.println("December");
        }

    }
}
/*
Please, Enter integer number between 1-12 : 9
September
 */

