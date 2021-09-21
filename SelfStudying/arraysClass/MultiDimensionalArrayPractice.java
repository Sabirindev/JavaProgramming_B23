package arraysClass;

import java.util.Arrays;

public class MultiDimensionalArrayPractice {
    public static void main(String[] args) {
        int[][][] arr3D =        { { {1,2,3}, {4,5}} , { {6,7,8}, {9,10} }  };
        //index n of arr#D[][]][];          0                   1
        System.out.println(arr3D.length); //length is 2

        System.out.println(arr3D[0][1][0]); // 4

        System.out.println(Arrays.deepToString(arr3D));



    }
}
