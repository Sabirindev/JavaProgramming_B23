package VI.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionalArrayLargestNumber2_NestedForLoop {
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
        for (int i = 0; i < rows; i++) { // rows =  arr.length
            for (int j = 0; j < cols; j++) { // cols = arr[i].length
                if (largestNumber < arr[i][j]){
                    largestNumber = arr[i][j];
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = largestNumber;
            }
        }
        System.out.println(largestNumber);
        System.out.println(Arrays.deepToString(arr));
        inp.close();

    }
}
/*
Given a 2d array of ints, find the biggest number(integer) and
 replace all array values on biggest number in the array then print an array.

 Given values: [[1, 2, 3], [5, 33, 9]]
output: [[33, 33, 33], [33, 33, 33]]
 */
