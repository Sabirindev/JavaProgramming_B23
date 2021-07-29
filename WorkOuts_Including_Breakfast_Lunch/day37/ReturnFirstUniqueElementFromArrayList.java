package day37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReturnFirstUniqueElementFromArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,1,2,2,3,4,5,5,6,6,7,8,9,10));

        //**********First way**********
        ArrayList<Integer> uniques = new ArrayList<>(list);
        uniques.removeIf( p -> Collections.frequency(uniques, p) != 1 );
        int firstUnique = uniques.get(0);

        System.out.println(uniques);

        /*
        //***************second way ************
        int firstUnique = 0;
        for (Integer integer : list) {
            if (Collections.frequency(list,integer)==1){
                firstUnique = integer;
                break;
            }
        }

         */
        System.out.println("First Unique element is "+firstUnique);
    }
}
/*
\2. write a program that can return the first unique elements of an ArrayList
 */
