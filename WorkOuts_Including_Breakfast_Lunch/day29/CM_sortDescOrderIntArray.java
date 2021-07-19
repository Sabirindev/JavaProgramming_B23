package day29;

import java.util.Arrays;

public class CM_sortDescOrderIntArray {
    public static void main(String[] args) {
        int array[] = {10,5,9,2,4,1,6,8,3,7};
        System.out.println("array before sorting: "+Arrays.toString(array));
        sortDesc(array);

    }
    public  static void sortDesc(int arr[]){
        Arrays.sort(arr); // sorting in ascending order
        System.out.println("Ascending order: "+Arrays.toString(arr));
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[(arr.length-1)-i]; //reversing sorted array
        }
        System.out.println("descending order: "+Arrays.toString(result));
    }
}
/*
5. create a function that can print out the array of integers in descending order
 */
