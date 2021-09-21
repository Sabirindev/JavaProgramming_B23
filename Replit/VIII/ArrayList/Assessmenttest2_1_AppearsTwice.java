package VIII.ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Assessmenttest2_1_AppearsTwice {

    public static boolean appearsTwice(String target, String sentence) {
        String arr[] = sentence.split(" ");
        //System.out.println(Arrays.toString(arr));
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains(target)){
                count++;
            }
        }
        //System.out.println(count);
        return count == 2;
    }

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the word: ");
        String target = scan.next();
        scan.nextLine();
        System.out.println("Enter the sentence: ");
        String sentence = scan.nextLine();

        System.out.println(appearsTwice(target,sentence));
    }
}
/*
`Write a a method appearsTwice() that returns true,
if value of variable target appears only twice in the string sentence,
otherwise return false.

Examples:

Main.appearsTwice("java", "java is fun!")
returns false, because java appears only once.

Main.appearsTwice("laptop", "I would like to buy a new laptop, because my laptop is too old.")
returns true, because laptop appears twice.


 */
