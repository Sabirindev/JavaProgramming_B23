package IV.String;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseSentence2_trim_split {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String reversedWords[] = sentence.split(" ");
        System.out.println(Arrays.toString(reversedWords));
        String reverseSentence ="";


        for (int i = reversedWords.length-1; i >=0 ; i--) {
            reverseSentence += " "+reversedWords[i];
        }
        System.out.println(reverseSentence.trim());
        input.close();
    }
}
/*
Given a String variable sentence,
write code to get each word and
assign to String reversed in reverse order.

Example:

sentence -> Java is fun

reversed > fun is Java
 */
