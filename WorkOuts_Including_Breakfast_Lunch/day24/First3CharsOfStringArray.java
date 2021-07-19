package day24;


import java.util.Scanner;

public class First3CharsOfStringArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How may classmates do you want to enter???");
        String[] classmates = new String[scan.nextInt()];

        for (int i = 0; i < classmates.length; i++) {
            System.out.println("Enter a classMate's name:");
            classmates[i] = scan.next();
        }

        for (int i = 0; i < classmates.length; i++) {
            System.out.println(classmates[i].substring(0,3));
            }

    }
}
/*
1. create string array, and store the names of your  class mates (10)
            print the first three characters of each name

 */
