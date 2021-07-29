package day37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SwapingFirstWithLastElmentOfArrayList {
    public static void main(String[] args) {
        String[] names1 = {"Esra","Sabir","Muhtar","Mousa"};
        ArrayList<String> names2 =new ArrayList<>();
        names2.addAll(Arrays.asList(names1));

        System.out.println(names2);
        Collections.swap(names2,0,names2.size()-1);
        System.out.println(names2);
    }
}
/*
1. write a program that can swap the first and last elements of an ArrayList
 */
