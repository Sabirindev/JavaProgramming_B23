package V.Loops;

import java.util.Scanner;

public class PrintVowels_forLoop_charAt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        String result = "";

        for (int i = 0; i < word.length(); i++) {
            char vowel = word.charAt(i);
            if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u' ||
                    vowel == 'A' || vowel == 'E' || vowel == 'I' || vowel == 'O' || vowel == 'U'){
                result += vowel;
//                if ((!result.contains(""+vowel))){ // for removing dublicated vowels
//                    result += vowel;
//                }
            }
        }
        System.out.println(result);
        scan.close();
    }
}
/*
Create a program that will take the given String **In** and print out all the vowels from the String.


Example:

Input: howdyho
Output: oo

Input: huehuehuehue
Output: ueueueue
 */
