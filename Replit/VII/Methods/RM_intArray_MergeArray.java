package VII.Methods;

import java.util.Arrays;
import java.util.Scanner;

public class RM_intArray_MergeArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[scan.nextInt()];
        int[] nums2 = new int[scan.nextInt()];

        for (int i = 0; i < nums.length; i++) {
            nums[i]= scan.nextInt();
        }
        for (int i = 0; i < nums2.length; i++) {
            nums2[i] = scan.nextInt();
        }

        System.out.println(Arrays.toString(mergR(nums,nums2)));
    }
    public static int[] mergR(int[] a, int[] b){
        int num3[] = new int[a.length+b.length];
        int k = 0;
        for (int each : a) {
            num3[k++] = each;
        }
        for (int each : b) {
            num3[k++] = each;
        }

        return num3;
    }

}
/*
mergR merges two arrays into one. It gets two int arrays and returns an int array

Example:

mergR([1,2,3],[4,5,6])
returns [1,2,3,4,5,6]

mergR([1,2],[6,8])
returns [1,2,6,8]

hint:

create a length int for the combined length of both arrays.
create an array with that length (thats the array we will return).
create an iterator for both arrays (int z=0).
loop first array and inside the loop insert current element to the return array (ret[z]=a[i];)
then increment the iterator for both arrays (z++).
do the same for the second array.
 */
