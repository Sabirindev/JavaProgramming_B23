package day10_If_Nested_If_Ternary_Statements;

public class ConverNumToWord {
    /*
    Write a java program that can convert numbers between 0 ~ 9 to words
            ex:
                number = 1
            output:
                One
     */

    public static void main(String[] args) {
        int num = 5;
        String numInWord = "";

        if (num >= 0 && num <= 9) {
            if (num == 0) {
                numInWord = "Zero";
            } else if (num == 1) {
                numInWord = "One";
            } else if (num == 2) {
                numInWord = "Two";
            } else if (num == 3) {
                numInWord = "Three";
            } else if (num == 4) {
                numInWord = "Four";
            } else if (num == 5) {
                numInWord = "Five";
            } else if (num == 6) {
                numInWord = "Six";
            } else if (num == 7) {
                numInWord = "Seven";
            } else if (num == 8) {
                numInWord = "Eight";
            } else {
                numInWord = "Nine";
            }

        } else {
            numInWord = "Invalid Number according to rule of task";
        }
        System.out.println(num + " is " + numInWord);
    }
}
