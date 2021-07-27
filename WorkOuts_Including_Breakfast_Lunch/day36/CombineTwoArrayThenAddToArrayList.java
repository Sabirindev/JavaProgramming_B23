package day36;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineTwoArrayThenAddToArrayList {
    public static void main(String[] args) {
        String arr1[] = {"A", "B", "C"},
                arr2[] = {"D", "E", "F", "G"};
        ArrayList<String> list  = new ArrayList<>();

        list.addAll(Arrays.asList(arr1));
        list.addAll(Arrays.asList(arr2));
        System.out.println(list);

        System.out.println("************VERY IMPORTANT ***********");
        System.out.println("--------------------------------------");
        int[] numbers = {1,2,3,4,5,6,7};
        ArrayList<Integer> list4 = new ArrayList<>();
        // list4.addAll( Arrays.asList(numbers) ); // Arrays.asList only converts non primitive to collection
                                                   // NOT primitive to collection


        for (int each : numbers) {
            list4.add(each);
        }

        System.out.println(list4);

    }
}
/*
3. write a program that can combine two String arrays into one arrayList
                ex:
                    arr1 = {"A", "B", "C"};
                    arr2 = {"D", "E", "F", "G"};
                    list ==> {"A", "B", "C", "D", "E", "F", "G"}
 */
