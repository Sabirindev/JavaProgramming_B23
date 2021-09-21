package V.Loops;

import java.util.Scanner;

public class CountHi_substring_equals_forLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        int CountHi = 0;

        for (int i = 0; i <= str.length()-2; i++) {
            String each = str.substring(i,i +2);

            if (each.equals("hi")){
                CountHi++;
            }
        }
        System.out.println(CountHi);
        scan.close();
    }
}
/*
Print out the number of times that the string "hi" appears anywhere in the given string.
Only lowercase "hi" should be counted.

Example:
input: abc hi how hi
output: 2

Example:
input: hi code java please
output: 1
 */
