package IV.String;

import java.util.Scanner;

public class PrintFirstHalfOfWordTwice_substring_NestedLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        String result = "";
        int halfLength = word.length()/2;
        System.out.println(halfLength);

        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < halfLength; i++) {
                result += word.substring(i,i+1);
            }
        }
        System.out.println(result);
        scan.close();
    }
}
/*
Write a program that will print out first half of the word twice.
Example:
```
input: java

output: jaja
```
```
input: unity

output: unun
 */
