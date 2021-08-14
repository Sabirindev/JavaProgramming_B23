package day37_Custom_Class;

import java.util.ArrayList;
import java.util.Arrays;

public class Practicing2 {
    public static void main(String[] args) {
        ArrayList<Integer> list1= new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,2,5,3,3,4,5,6,7,8,9,10,11,11,12,13));

        System.out.println(list1);

        //list1.removeIf(each-> (each >= 8)); //
        System.out.println(list1);

        System.out.println("*******************************");

//        list1.retainAll(Arrays.asList(5,11)); // retainAll keeps given elements, others are removed
//        System.out.println(list1);

        //[1, 2, 2, 5, 3, 3, 4, 5, 6, 7, 8, 9, 10, 11, 11, 12, 13]
        // 0  1  2  3  4  5   6 . . . ..

        Integer a = 20;
        list1.remove(5);// int

        System.out.println(list1.remove(a));
        //[1, 2, 2, 5, 3, 4, 5, 6, 7, 8, 9, 10, 11, 11, 12, 13]
        // 0  1  2  3  4  5  6  7  8  9 .  . .   .

        System.out.println(list1);
        System.out.println(list1.indexOf(5));
        System.out.println(list1.lastIndexOf(5));

        System.out.println(list1.contains(13));//false


        //list1.clear();





        //System.out.println(list1.get(10));

//        Integer c = 2;
//
//        System.out.println(list1);
//        list1.removeAll(Arrays.asList(c));
//        System.out.println(list1);





    }
}
