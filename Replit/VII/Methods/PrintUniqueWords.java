package VII.Methods;

import java.util.Scanner;

public class PrintUniqueWords {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        int size = scan.nextInt();
        String arrWords[] = new String[size];
        for (int i = 0; i < arrWords.length; i++) {
            arrWords[i] = scan.next();
        }

        printUniqueWords(arrWords);
    }
    public static void printUniqueWords(String words[]){
        for (int i = 0; i < words.length; i++) {
            int count = 0;
            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j])){
                    count++;
                }
            }
            if (count == 1){
                System.out.println(words[i]);
            }
        }
    }
}
/*
Complete the void method printUniqueWords() that will print only unique words
from an array of strings. Every single unique word should be printed from the new line.

Example:

input:[java, code, python, code, rust, code, rust]

output:
java
python
 */
