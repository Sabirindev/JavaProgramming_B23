package VI.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FindMax_forLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()
        ,input.nextInt()};

        int maxNum = nums[0];

        //System.out.println(Arrays.toString(nums));

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]> maxNum){
                maxNum=nums[i];
            }
        }
        System.out.println(maxNum);
        input.close();
    }
}
/*
Given an array num, get the max number in the array and print it out to the console.

nums → [2, 4, 2, 3, -2]) → 4
nums → [2, 2, 5, 3, 0 ]) → 5
nums → [1, 33, 5, 7, 9]) → 33
 */
