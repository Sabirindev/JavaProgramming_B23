package day17_StringMethods3;

import java.util.Scanner;

public class EndingWithLy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = scan.next();

        boolean endsWithLY = word.substring(word.length()-2).equals("ly");
        boolean endsWithLY2 = word.endsWith("ly");

        if (endsWithLY){
            System.out.println("really???");
        }else {
            System.out.println("never mind");
        }

        scan.close();
    }
}
/*
3. ask the user to enter a word.
        if the word ends with "ly", print "really???" ,  otherwise, print "never mind"
 */
