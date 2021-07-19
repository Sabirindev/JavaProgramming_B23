package day12_Scanner;

import java.util.Scanner;

public class Rectangle_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the width of rectangle:");
        int width = scan.nextInt();

        System.out.println("Enter the length of rectagle");
        int length = scan.nextInt();

        int area = width * length;
        int perimeter = (width+length)*2;
        System.out.println("area = "+area);
        System.out.println("perimeter = "+perimeter);

//        double num1 = scan.nextDouble();
//        double num2 = scan.nextDouble();
//
//        double sum = num1 + num2;
//        System.out.println(sum);
    }
}
