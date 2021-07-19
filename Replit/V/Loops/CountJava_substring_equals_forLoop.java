package V.Loops;

import java.util.Scanner;

public class CountJava_substring_equals_forLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int countJava = 0;

        for (int i = 0; i <= word.length() - 4; i++) {
            String eachJava = word.substring(i, i + 4);// each word which length of it is 4
            // will be added to eachJava variable
            if (eachJava.equals("java")) { //then eachJava's value is compared with word "java" if they are matched
                countJava++; // then counter will be increased by one in every cycle
            }
        }
        System.out.println(countJava);
        scan.close();
    }
}
/*
Print the number of times that the string "java" appears anywhere in the given string word

Example:
input: javaxjava
output: 2

Example:
input: javaxjavaapplepearjavaegg
output: 3
 */
