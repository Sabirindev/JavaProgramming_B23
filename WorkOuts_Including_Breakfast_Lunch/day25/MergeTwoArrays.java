package day25;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4},
                arr2[] = {5,6};
        int arr3[] = new int[arr1.length + arr2.length];

        int j =0;// for index numbers of third array
        for (int i = 0; i < arr1.length; i++) { //for arr1
            arr3[j++] = arr1[i];//retrieves each element from arr1 and assigns them to the indexes of arr3
            //arr3[] = {1,2,3,4,0,0}
        }
        System.out.println("j is the index number of arr3, this after transfering elements from arr1[] to arr3[] : "+j);
        for (int i = 0; i < arr2.length; i++) { //for arr2
            arr3[j++] = arr2[i]; //retrieves each element from arr2 and assigns them to the indexes of arr3
        }
        System.out.println("j is the index number of arr3, this after transfering elements from arr2[] to arr3[] : "+(j-1));
        System.out.println(Arrays.toString(arr3));
    }
}
/*
2. write a program that can print out the unique numbers from an array of integers
        Ex:
            int[] arr ={1,1,2,3,3,4}

            output:
                2 4
 */
