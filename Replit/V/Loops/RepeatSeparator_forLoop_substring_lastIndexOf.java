package V.Loops;

import java.util.Scanner;

public class RepeatSeparator_forLoop_substring_lastIndexOf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();

        String result ="";

        for (int i = 0; i < count; i++) {
            result += word+separator;
        }
        //result = result.substring(0,result.lastIndexOf(separator));
        System.out.println(result.substring(0,result.lastIndexOf(separator)));

        //2nd and short way
//        String result = word;
//        for (int i = 1; i <=count-1; i++) {
//            result = result+separator+word;
//        }
//        System.out.println(result);



        scan.close();
    }
}
/*



Given two strings, **word** and a separator **sep**,
 return a big string made of **count** occurrences of the word,
 separated by the separator string.


Example:
input:
Word
X
3
output: WordXWordXWord

Example:
input:
This
And
2
output: ThisAndThis

Example:
input:
This
And
1
output: This
 */
