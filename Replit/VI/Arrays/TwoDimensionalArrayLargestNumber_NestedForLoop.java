package VI.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionalArrayLargestNumber_NestedForLoop {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int rows = inp.nextInt(), cols = inp.nextInt();

        int arr[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = inp.nextInt();
            }
        }
        int largestNumber = arr[0][0];
        for (int i = 0; i < arr.length; i++) { // arr.length = rows
            for (int j = 0; j < arr[i].length; j++) { // arr[i].length = cols
                if (largestNumber < arr[i][j]) {
                    largestNumber = arr[i][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println(largestNumber);
        inp.close();
    }
}
/*
Given a 2d array of ints, find the biggest number(int) in the array and print it.
 */