package V.Loops;

import java.util.Scanner;

public class EqualsJavaAndPython_substring_equals_forLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        int countJava =0, countPython = 0;
        //***java counter***
        for (int i = 0; i <= sentence.length()-4; i++) {
            String eachJava = sentence.substring(i,i+4);
            if (eachJava.equals("java")){
                countJava++;
            }
        }
        //***python counter***
        for (int i = 0; i <=sentence.length()-6; i++) {
            String eachPython = sentence.substring(i,i+6);
            if (eachPython.equals("python")){
                countPython++;
            }
        }
        boolean isEqual = countJava == countPython;
        System.out.println(isEqual);
        scan.close();
    }
}
/*
Given a string, print out true if the number of appearances of "java" anywhere in the string
is equal to the number of appearances of "python" anywhere in the string (case sensitive).

Example:
input: We study java not python

output: true

Example:
input: What's the difference between java, javascript and python?

output: false
 */
