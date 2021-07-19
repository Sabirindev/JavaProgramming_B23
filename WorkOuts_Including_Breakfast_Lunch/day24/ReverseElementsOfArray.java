package day24;

import java.util.Arrays;

public class ReverseElementsOfArray {
    public static void main(String[] args) {

        System.out.println("******  int typed Array *******");
        int[] array = {1,2,3,4,5};
        int[] reversedArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[(array.length-1)-i];
        }

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(reversedArray));

        System.out.println("******  String typed Array *******");
        String names[] = {"Sabir","Muhtar","Asiya"};
        String reversedNames[] = new String[names.length];

        for (int i = 0; i < names.length; i++) {
            reversedNames[i] = names[(names.length-1) - i];
        }
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(reversedNames));

    }
}
/*
4. Write a program that can reverse an array of integers
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};
 */
