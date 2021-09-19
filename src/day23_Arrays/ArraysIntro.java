package day23_Arrays;

public class ArraysIntro {
    public static void main(String[] args) {


        /*
        int,short,byte,long
         */



        /* // there 3 Data Structues in Java, Collection of Data
        1.Array : collection of similiar type of data
        2.Map
        3.Collection ( ArrayList,)
         */
        int                a       =           10;
        // Data type      variable name         value of variable..

        double b = 2.5;// 1

        //                         index                   0 1 2 3 4
          int[]             array1     =                  {1,2,3,4,5};// length of array is 5 and max index is 4
        //Data type      variable name(array name)         values of array
        // length-1

        // array's size is fixed.



        int array2[] = {4,5,7,9,3,1};
        //index         0 1 2 3 4 5

        //int array3[] = new int[array2.length+1];

        System.out.println(array2[3]); // 9
        double c =  array2[3];



        double array3[] = {4,5,7,9,3,1};
        int d =(int) array3[5];







        String[] group1 = {"Feruza", "Yuliang", "Tamara", "Ahmet"};//4
        //        index      0          1          2       3


        //retrieve data from array
        System.out.println(group1[0]);//Feruza
        System.out.println(group1[1]); // Yuliang
        System.out.println(group1[2]);//Tamara
        System.out.println(group1[3]);//Ahmet
        //System.out.println("group1[4] = " + group1[4]);

        System.out.println("---------------------------------------------");

        for (int i = 0; i <= 3; i++) {
            System.out.println(group1[i]); // Feruza
            //Yuliang
            //Tamara
            //Ahmet
        }
    }
}
