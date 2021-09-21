package VI.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SplitSentence_split {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String sentenceArr[] = sentence.split(" "),
                words ="";
        //System.out.println(Arrays.toString(sentenceArr));
        for (int i = 0; i < sentenceArr.length; i++) {

            words += sentenceArr[i]+"\n";

        }
        System.out.println(words);
        input.close();

    }
}
/*
Given a String variable **sentence,**
write code to type each word in separate lines.

Example:
sentence -> "Java is fun"

Output:

Java
is
fun
 */
