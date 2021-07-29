package day37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class returnNthLargestNumFromArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,1,1,2,2,3,3,3,4,4,4,5,5,6,6,7,7,8,8,9,9,10,10));

        ArrayList<Integer> original = new ArrayList<>(numbers);
        System.out.println(numbers);

        // Collections.sort(numbers); //asc
        // Collections.reverse(numbers); // desc

        // 5th maximum number:

        int n = 5;
        for (int i = 1; i < n ; i++) {
            numbers.removeIf( p -> p == Collections.max(numbers));
        }

        System.out.println(numbers);

        int fifthMaxNumber = Collections.max(numbers);

        System.out.println("fifthMaxNumber = " + fifthMaxNumber);


    }
}
/*
    4. Write a program that can return the nth largest number from an ArrayList of integers
 */
