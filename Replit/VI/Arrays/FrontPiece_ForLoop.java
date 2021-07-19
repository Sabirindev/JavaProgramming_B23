package VI.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FrontPiece_ForLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the size of int typed of array:");
        int size = scan.nextInt();
        int nums[] = new int[size];
        int nums2[] = new int[2];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = scan.nextInt();
        }
        //System.out.println(Arrays.toString(nums));

        for (int i = 0; i < 2; i++) {
            if (nums.length == 1) {
                nums2 = new int[1];
                nums2[i] = nums[i];
                break;
            } else {
                nums2[i] = nums[i];
            }
        }
        System.out.println(Arrays.toString(nums2));




    }
}
/*
Given an int array **num** of any length,
print a new array of its first 2 elements.
If the array is smaller than length 2,
use whatever elements are present.

Examples:
input: 1, 2, 3
output: [1, 2]

Examples:
input: 1
output: [1]

Examples:
input: 4, 5, 4, 3, 8
output: [4, 5]


 */
