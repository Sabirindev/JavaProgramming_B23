package VI.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ShiftLeft_ForLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        int nums[] = new int[size];
        int nums2[] = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = scan.nextInt();
        }
        int firstElement = nums[0];
        for (int i = 0; i < nums.length-1; i++) {
            nums2[i] = nums[i+1];
        }
        nums2[nums2.length-1] = firstElement;
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(nums2));
        scan.close();
    }
}
/*
Modify an array that is "left shifted" by one,
so {6, 2, 5, 3} becomes {2, 5, 3, 6}.
You may modify and print the given array, or print a new array.`

Example:

input: 6, 2, 5, 3
output: [2, 5, 3, 6]
 */
