package IV.String;

import java.util.Scanner;

public class DublicateWords_concatenation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word1 = scan.next(), word2 = scan.next();

        //by +(concatenation) operand
        //String result = word1+word2+word2+word1;
        //by concat() method
        String result = word1.concat(word2).concat(word2).concat(word1);
        System.out.println(result);
        scan.close();
    }
}
/*
You have 2 words

Print the first word, second word, second word, first word

Input:

one

two
Input:

one

two
Output:

onetwotwoone
 */
