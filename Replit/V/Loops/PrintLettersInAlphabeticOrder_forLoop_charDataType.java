package V.Loops;

import java.util.Scanner;

public class PrintLettersInAlphabeticOrder_forLoop_charDataType {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char start = scan.next().charAt(0);
        char end = scan.next().charAt(0);

        char i = 82;
        System.out.println(i); //R
        //**********if i give a value start as 'a', end as 'c'****** REMEMBER!!!!!!!!!!!
        System.out.println(start); //a
        System.out.println(end); //c
        System.out.println(++start); //b
        System.out.println(++end);//d


//        for (char i = start; i <= end; i++) {
//            System.out.print(i);
//        }
        scan.close();
    }
}
/*
Write a program that will print out letters in the alphabetic order accordingly to the given range within 2 chars.


Example:
input:
A
Z
output: ABCDEFGHIJKLMNOPQRSTUVWXYZ

Example:
input:
a
f
output: abcdef

Example:
input:
a
d
output: abcd

Example:
input:
B
O
output: BCDEFGHIJKLMNO
 */
