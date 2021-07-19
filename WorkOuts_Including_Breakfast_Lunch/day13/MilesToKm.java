package day13;
import java.util.Scanner;

public class MilesToKm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the mile(s): ");
        double mile = scan.nextDouble(), km = 0;
        String result = "";

        if (mile>=0){
            km = mile * 1.609;
            result = mile + " mile(s) equal to "+km+" kilometers";
        }else {
            result = "Invalid number entered";
        }
        System.out.println(result);
    }
}
/*
 Write a program that can convert Miles to KM
            Ex:
                Enter miles:
                10.0

                output:
                10.0 miles equal to 16.09 kilometers
 */
