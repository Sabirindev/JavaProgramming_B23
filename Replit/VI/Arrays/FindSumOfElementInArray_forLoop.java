package VI.Arrays;

import java.util.Scanner;

public class FindSumOfElementInArray_forLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] num = {scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt()};

        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        System.out.println(sum);
    }
}
/*
Given an array **num**, calculate the sum of all numbers in the array and print out to the console.

```
nums → [2, 1, 2, 3, 4]) → 12
nums → [2, 2, 0, 3, 5]) → 12
nums → [1, 3, 5, 7, 9]) → 25
 */
