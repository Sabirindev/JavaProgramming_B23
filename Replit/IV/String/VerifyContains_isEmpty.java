package IV.String;

import java.util.Scanner;

public class VerifyContains_isEmpty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String sentence = scan.nextLine();

        boolean isContained = sentence.contains(word);
        if (isContained){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
/*
Write a program that will verify if the **sentence** contains **word**.
Print out the result as a boolean value.
 */
