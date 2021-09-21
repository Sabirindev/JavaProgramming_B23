package primitiveDataType;

import java.util.Scanner;

public class RetunNumsIfLastDigitIsSame {
    public static void main(String[] args) {
        System.out.println("Enter 3 numbers between 10 and 1000");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = scan.nextInt();
        System.out.println("Enter second number:");
        int b = scan.nextInt();
        System.out.println("Enter third number:");
        int c = scan.nextInt();

        if ((a < 10 || a > 1000) || (b < 10 || b > 1000) || (c < 10 || c > 1000)){
            System.out.println("Wrong number(s) entered");
            System.exit(0);
        }

        System.out.println(checkLasDigits(a, b, c));
    }

    public static boolean checkLasDigits(int a, int b, int c) {
        Integer ab = a - b, ac = a - c, bc = b - c;
        String AB = ab.toString(), AC = ac.toString(), BC = bc.toString();
        System.out.println(AB + " " + AC + " " + BC);
        if (AB.endsWith("0") || AC.endsWith("0") || BC.endsWith("0")) {
            return true;
        } else{
            return false;
        }
    }
}
