package day29;

import java.util.Arrays;

public class CM_Combination2Arrays {
    public static void main(String[] args) {
        int array1[]={1,2,3,4,5};
        int array2[] = {6,7,8,9,10,11,12};
        System.out.println("array1 = "+Arrays.toString(array1));
        System.out.println("array2 = "+Arrays.toString(array2));
        mergeTwoArrays(array1,array2);
    }
    public static void mergeTwoArrays(int arr1[], int arr2[]){
        int array3[] = Arrays.copyOf(arr1,arr1.length+arr2.length);
        System.out.println("array3 after adding elements of array1 = "+Arrays.toString(array3));
        int i = arr1.length;
        for (int each : arr2) {
            array3[i++] = each;
        }
        System.out.println("array3 after adding elements of array2 = "+Arrays.toString(array3));
    }
}
/*
2. create a function that can print out the combination of two integer arrays
 */