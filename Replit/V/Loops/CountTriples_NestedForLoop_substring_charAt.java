package V.Loops;

import java.util.Scanner;

public class CountTriples_NestedForLoop_substring_charAt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String strTriple = scan.next();

        int countTriple = 0;

        for (int i = 0; i < strTriple.length()-2; i++) {
            String chOfTriple = "" + strTriple.charAt(i);
            for (int j = 1; j < 3; j++) {
                if (chOfTriple.equalsIgnoreCase(strTriple.substring(i+j,i+j+1))){
                    if (j==2) {
                        countTriple++;
                        i+=2;
                    }
                }else {
                    break;
                }
            }
        }
        /*
          for (int i = 0; i < strTriple.length() - 2; i++) {
            String chOfTriple = "" + strTriple.charAt(i);
            for (int j = 1; j < 3; j++) {
                if (chOfTriple.equalsIgnoreCase(strTriple.substring(i+j,i+j+1))){
                    if (j==2) {
                        countTriple++;
                    }
                }else {
                    break;
                }
            }
        }
         */
        System.out.println(countTriple);
        scan.close();

    }
}
/*
We'll say that a "triple" in a string is a char appearing three times in a row.
 Print out the number of triples in the given string. The triples may overlap.

 Example:

input: abcXXXabc
output: 1

Example:

input: xxxabyyyycd
output: 3

Example:

input: java
output: 0
 */
