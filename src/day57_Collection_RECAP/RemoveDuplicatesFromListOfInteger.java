package day57_Collection_RECAP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class RemoveDuplicatesFromListOfInteger {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,1,2,2,2,3,3,3,4,4,7,7,7,5,5,5,6,6,6,10,10,8,8,9,9));

        //convert one collection type to another:
        list = new ArrayList<>(new TreeSet<>(list));

        System.out.println("list = " + list);

        System.out.println("\n**********************************************");
        Integer[] nums = {1,1,1,2,2,2,3,3,3,4,4,7,7,7,5,5,5,6,6,6,10,10,8,8,9,9};

        //converting collectionType to array data structure
        nums = new TreeSet<>(Arrays.asList(nums)).toArray(new Integer[0]);

        System.out.println("Arrays.asList(nums) = " + Arrays.asList(nums));

        System.out.println("\n********** extra practice *****************");
        String[] students = {"Feruza","Sabir","Mucahit","Ismail"}; //"Esra"

        ArrayList<String> l =new ArrayList<>(Arrays.asList(students));
        l.add("Esra");
        l.add("Aysu");

        //convert Collection type to another collection type
        students = l.toArray(new String[0]);
        System.out.println("Arrays.asList(students) = " + Arrays.asList(students));

        System.out.println("\n******************************************");

        Integer[] nums2 = {1,2,3,4,5,6,7,8,9,10};

        ArrayList<Integer> l2 = new ArrayList<>(Arrays.asList(nums2));
        l2.removeIf(p-> p%2==0);
        nums2 = l2.toArray(new Integer[0]);

        System.out.println("Arrays.toString(nums2) = " + Arrays.toString(nums2));


    }
}
/*
3. write a program that can remove the duplicated Integers from a List of Integer
            Do Not change the insertion order
 */
