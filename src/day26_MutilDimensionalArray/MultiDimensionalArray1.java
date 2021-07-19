package day26_MutilDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArray1 {
    public static void main(String[] args) {
        // 2 dimensional array: must contain 1 dimensional arrays

        int[][] arr2D = {{1,2,3},{4,5},{6,7,8}};
        //   index          0      1      2
        System.out.println(arr2D.length); //3

        //Arrays.toString(one D array) : it is for to print (retrieve) only singel D array
        System.out.println(Arrays.toString(arr2D[1]));//retrieve single D array from 2D array

        //Arrays.deeptToString(2D array):it is for printing (retrieve) multi D array
        System.out.println(Arrays.deepToString(arr2D));
        System.out.println(arr2D[1][1]); //5
        System.out.println("******************* For Loop ***********************************");
        // int[][] arr2D = {{1,2,3},{4,5},{6,7,8}};
        for (int i = 0; i < arr2D.length; i++) {// i: idex numbers of single dimensiona arrays
            int[] each1DArray = arr2D[i];//retrieve each single dimensional array
            System.out.println(Arrays.toString(each1DArray));
            for (int j = 0; j <each1DArray.length ; j++) {//j: index numbers of the elements in each single dimensional array
                //System.out.println(each1DArray[j]);
                System.out.print(arr2D[i][j]+" ");
            }
            System.out.println();//appeand new line after printing each element of array in one line
        }
        System.out.println("********************* ForEachLoop ***********************************");
        // int[][] arr2D = {{1,2,3},{4,5},{6,7,8}};
        for (int[] each1D : arr2D) {
            for (int elemntOf1D : each1D) {
                System.out.print(elemntOf1D+"");
            }
            System.out.println();//appeand new line after printing each element of array in one line
        }
    }
}
