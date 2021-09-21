package I.Basics;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PrintVariable4 {
    /*
    Given a String variable word assume the variable has a value and use it to display the word of the day.

Ex: Input: Java

Output: Today's word of the day is: Java

Ex: Input: Apple

Output: Today's word of the day is: Apple
     */
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        String word = a.nextLine();

        System.out.println("Today's word of the day is: "+word);

    }
}
