package day23_Arrays;

import java.util.Scanner;

public class Days_Arrays {
    public static void main(String[] args) {
        String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        // index            0         1         2           3         4         5          6

        System.out.println("Enter a number:");
        int n = new Scanner(System.in).nextInt();

        System.out.println(days[n-1]);


    }
}
