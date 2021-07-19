package day12_Scanner;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt(),
                num2 = scan.nextInt();

        int addition = num1 + num2;
        int subtraction = num1 - num2;
        int multiplication = num1 * num2;
        int division = num1/num2;

        System.out.println("addition = " + addition);
        System.out.println("subtraction = " + subtraction);
        System.out.println("multiplication = " + multiplication);
        System.out.println("division = " + division);

    }
}
