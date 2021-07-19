package day19_ForLoop;

import java.util.Scanner;

public class StringReverse_ForLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter name:");
        String name = scan.nextLine();

        String reverseName ="";

        for (int i = name.length()-1; i >= 0; i--) {
            reverseName += ""+ name.charAt(i);
        }
        System.out.println("Reverse version of "+name+" is "+reverseName);
    }
}
