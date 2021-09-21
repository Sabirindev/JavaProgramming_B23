package VI.Arrays;

import java.util.Scanner;

public class CountEvenNums_forLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = {scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt()
                ,scan.nextInt()};
        int countEven =0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]%2==0){
                countEven++;
            }
        }
        System.out.println(countEven);
        scan.close();
    }
}
/*
Given an array **nums**, count and print the number of even numbers in the array

Examples:

nums → [2, 1, 2, 3, 4]) → 3

nums → [2, 2, 0, 3, 5]) → 3

nums → [1, 3, 5, 7, 9]) → 0
 */
