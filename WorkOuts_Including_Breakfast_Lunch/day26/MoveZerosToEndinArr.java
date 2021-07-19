package day26;

import java.util.Arrays;

public class MoveZerosToEndinArr {
    public static void main(String[] args) {
        int[] array = {10, 0, 5, 0, -1, 0,6,8,9,0,4,-6,0,0,3,0};

        int[] array2 = new int[array.length];

       //forEachLoop
        System.out.println("***********ForEachLoop************");
        int k =0;
        for (int i : array) {

            if (i != 0){
                array2[k++]=i;
            }
        }
        System.out.println(Arrays.toString(array2));

        //for loop
        System.out.println("***********For Loop************");
        int  j =0;
        for (int i = 0; i < array.length; i++) {
            if( array[i] != 0  ){ //10  5  1
                array2[j] = array[i];
                j++; // after initializing the index, go to the next index
            }
        }
        System.out.println(Arrays.toString(array2));
    }
}
/*
write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                {10, 5, 1, 0, 0, 0}
      MUST use for each loop
 */
