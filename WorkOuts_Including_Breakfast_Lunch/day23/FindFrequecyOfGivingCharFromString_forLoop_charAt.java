package day23;

import java.util.Scanner;

public class FindFrequecyOfGivingCharFromString_forLoop_charAt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = "aabcccd";

        char ch = scan.next().charAt(0);
        int countCh = 0;

        for (int i = 0; i <= str.length()-1; i++) {
            char eachCh = str.charAt(i);
            if (eachCh == ch) {
                countCh++;
            }
        }
        System.out.println(countCh);
        scan.close();
    }
}
/*
1. Write a program that can find the frequency of any given character from a string
            Ex:
                str = "aabcccd";

                input: 'c'
                output: 3

                input: 'e'
                output: 0
 */
