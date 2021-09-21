package VI.Arrays;

import java.util.Scanner;

public class PrintFirst3CharsOfStringArray_forLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arr = new String[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextLine();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].substring(0,3));
        }

    }
}
/*
The code provided in your main method will take in five Strings and save them into an array called arr.
 Print out the first three letter of each element on seperate lines.
 You can assume that every element of arr is at least 3 letters long.

Example:
arr -> ["hello", "how", "are", "you", "doing"]

Output:
hel
how
are
you
doi
 */
