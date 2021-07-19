package day17;

import java.util.Scanner;

public class FirstLastChars {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter any word:");
        String word = scan.nextLine();

        if (word.substring(0,1).equalsIgnoreCase(word.substring(word.length()-1))){
            System.out.println("Same");
        }else {
            System.out.println("Not same");
        }


        scan.close();
    }
}
/*
3. write a program that can check if the first and last characters of the string are same
            ex:
                level
            output:
                same
 */
