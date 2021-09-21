package VI.Arrays;

import java.util.Scanner;

public class Printing02_ForLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String arr[] = new String[8];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextLine();
        }

        for (int i = 0; i < arr.length-1; i+=2) {
            System.out.println(arr[i]+", "+arr[i+1]);

        }
        scan.close();
    }
}
/*
The code provided in your main method will take in eight Strings and save them into an array arr.
Print out the 4 lines using for loop: each line should contain a pair of array elements

Example:

arr -> ["apple", "banana", "kiwi", "grape", "milk", "soda", "juice", "coffee"]
Output:
apple , banana
kiwi , grape
milk, soda
juice, coffee
 */
