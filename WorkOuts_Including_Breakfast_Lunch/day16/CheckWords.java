package day16;

import java.util.Scanner;

public class CheckWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 words:");

        String word1 = scan.next(),
                word2 = scan.next(),
                word3 = scan.next();

        boolean allSame = word1.length() == word2.length() && word1.length() == word3.length();
        boolean notSame = word1.length() != word2.length() && word2.length() != word3.length() &&
                word1.length() != word3.length();

        if (allSame){
            System.out.println("All words are same length");
        }else if (notSame){
            System.out.println("All different length");
        }else{
            System.out.println("Not Same nor Different lengths");
        }
    }
}
/*
Write a program  for CheckWords:
        Program accepts 3 words and :
            - if they are same length:  print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"
 */
