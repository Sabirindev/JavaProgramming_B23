package day57_Collection_RECAP;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class RemoveEvenNumsFromSetOfInteger {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.addAll(Arrays.asList(10, 10, 10, 3, 11, 8, 12, 7, 14, 15, 6, 5, 4, 3, 2, 1));

        System.out.println("set = " + set);

        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            if (it.next() % 2 == 0) {
                it.remove();
            }
        }
        System.out.println("set after removing even numbers = " + set);

        System.out.println("\n*******************************************");

        Set<Integer> set2 = new TreeSet<>();
        set2.addAll(Arrays.asList(10, 10, 10, 3, 11, 8, 12, 7, 14, 15, 6, 5, 4, 3, 2, 1));
        System.out.println("set2 = " + set2);

        set2.removeIf(p -> (p % 2 == 0));
        System.out.println("set2 after removing even Integers = " + set2);
    }
}
/*
2. write a program that can remove the even numbers from a Set of Integers
            DO NOT use Lambda expressions
 */