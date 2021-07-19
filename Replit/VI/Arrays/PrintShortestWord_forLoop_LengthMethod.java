package VI.Arrays;

import java.util.Scanner;

public class PrintShortestWord_forLoop_LengthMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] str = {scan.next(), scan.next(), scan.next(),
                scan.next(), scan.next(), scan.next()};

        int shortestLength = str[0].length();
        String shortesttWord = "";

        for (int i = 0; i < str.length; i++) {
            if (str[i].length() <= shortestLength) {
                shortestLength = str[i].length();
                shortesttWord = str[i];

            }
        }
        System.out.println(shortesttWord);
        scan.close();
    }
}
/*
Write a program that will print the shortest word in the given array str.

input: java, cable, red, vivid, remedy, grace

output: red
 */
