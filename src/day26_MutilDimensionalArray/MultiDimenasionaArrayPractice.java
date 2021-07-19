package day26_MutilDimensionalArray;

public class MultiDimenasionaArrayPractice {
    public static void main(String[] args) {
        int arr2D[][] = { {1,2,3} ,  {4,5,6,7,8} ,  {9,10,11,12,13} };
      //  index              0            1                 2

        //***********task1*****************
        //********** For Loop ***********
        System.out.println("********** For Loop fro Task1 ***********");
        for (int i = arr2D.length-1; i >=0 ; i--) {//i: is the index numbers of 2D array, and represent 1D array
            for (int j = 0; j < arr2D[i].length; j++) {//j: is the index numbers of 1D array, and represent elements of 1D array
                System.out.print(arr2D[i][j]+" ");
            }

            System.out.println();//to apeand to the new line
        }

        //********** ForEachLoop ***********
//        System.out.println("********** ForEachLoop ***********");
//        for (int each : arr2D[i]) {
//            System.out.println(each+" ");
//        }
//        System.out.println();

        //***********task2*****************
        //********** For Loop ***********
        System.out.println("********** For Loop2 for Task 2 ***********");
        for (int i = 0;  i < arr2D.length;i++){// i: index number of each single dimensional array starting from index 0

            for(int j =arr2D[i].length-1 ; j >=0; j-- ){ // j: index number of each element in single dimensional array, started from last index
                System.out.print(arr2D[i][j]+" ");
            }
            System.out.println();

        }

        System.out.println("********** ForEachLoop for Task 2 ***********");
        for (int[] each1D : arr2D ){// i: index number of each single dimensional array starting from index 0

            for(int j =each1D.length-1 ; j >=0; j-- ){ // j: index number of each element in single dimensional array,
                                                         // started from last index
                System.out.print(each1D[j]+" ");
            }
            System.out.println();

        }

        System.out.println("*********** for Loop for Task 3 ************");

        for (int i = arr2D.length - 1; i >= 0; i--) { // i: index number of each single dimensional array starting from last index

            for (int j = arr2D[i].length - 1; j >= 0; j--) {
                System.out.print(arr2D[i][j] +" ");
            }

            System.out.println();

        }


    }
}
/*
int arr2D[][] = { {1,2,3} ,  {4,5,6,7,8} ,  {9,10,11,12,13} };

            task1:
                9 10 11 12 13
                4 5 6 7 8
                1 2 3


            task2:
                3 2 1
                8 7 6 5 4
                13 12 11 10 9

            task3:
                13 12 11 10 9
                8 7 6 5 4
                3 2 1
 */