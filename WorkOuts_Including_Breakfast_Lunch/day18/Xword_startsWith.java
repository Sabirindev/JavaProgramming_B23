package day18;

import java.util.Scanner;

public class Xword_startsWith {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        boolean isStartingWithX = word.startsWith("x");
        if (isStartingWithX){
            word = word.substring(1);
            System.out.println(word);
        }else{
            System.out.println(word +" is not starting with \'x\'");
        }

        scan.close();
    }
}
/*
1. Ask user to enter a word. If the work contains starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code
 */
