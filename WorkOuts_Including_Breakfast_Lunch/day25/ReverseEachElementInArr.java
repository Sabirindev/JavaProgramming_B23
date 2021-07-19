package day25;

import java.util.Arrays;

public class ReverseEachElementInArr {
    public static void main(String[] args) {
        String array[] = {"Java", "Python", "C#"};

        /*** SOLUTION of reversing such String array String array[] = {"Java", "Python", "C#"};****
        first (1) we assign the each element from array to string variable one bye one,
        (2) then we reverse string value
        (3) then we assign the reversed value of string back to the new array..
         */

        for (int j = 0; j < array.length; j++) { // j: index numbers of the array ( starting from 0)

            String element = array[j]; //element of the array is added into string variable 'element'
            //0123
            String reverse = ""; //to store the reversed version of the element

            for (int i = element.length()-1; i >=0 ; i--) { // index numbers of the String
                reverse += element.charAt(i); // gets the characters from the string element
            }

            array[j] = reverse; // assigning reversed element to the index of the array

        }
        System.out.println(Arrays.toString(array));
        System.out.println(array.length);
//        String reversedArray[] = new String[array.length];
//        String reversed ="";
//
//        for (int i = 0; i < array.length; i++) {
//            //reversedArray[i] = array[(array.length-1)-i];
//            for (int j = 0; j < array[i].length(); j++) {
//                reversed += array[(array[i].length()-1)-j];
//            }
//        }
//        System.out.println(reversed);
//
//        System.out.println(Arrays.toString(reversedArray));
    }
}
/*
1. write a program that can  reverse each elements in an array of string
        Ex:
            array = {"Java", "Python", "C#"}

            output:
                ["avaJ", "nohtyP", "#C"]
 */
