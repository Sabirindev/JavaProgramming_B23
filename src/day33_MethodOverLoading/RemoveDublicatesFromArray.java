package day33_MethodOverLoading;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDublicatesFromArray {
    public static void main(String[] args) {
        System.out.println("**** remove dublicated char from string*****");
        String str = "aaabbbbbbcc";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (!result.contains(""+each)){
                result += each;
            }
        }
        System.out.println(result);

        System.out.println("************** int array *******************");

        int[] array = {1,1,1,2,2,2,2,2,3,3,3,4,4,4,5,5,5};
        System.out.println(Arrays.toString(array));

        array = removeDup(array);
        System.out.println(Arrays.toString(array));

        System.out.println("************** double array *******************");
        double[] array1 = {1.1,1.1,1.1,3.3,3.3,3.3,5.5,5.5,2.2,2.2,1.1,3.3,4.4};
        System.out.println(Arrays.toString(array1));

        array1 = removeDup(array1);
        System.out.println(Arrays.toString(array1));

        System.out.println("************** String array *******************");
        String[] array2 = {"bbb","aaa","bbb","aaa","Sabir","ccc","aaa"};
        System.out.println(Arrays.toString(array2));

        array2 = removeDup(array2);
        System.out.println(Arrays.toString(array2));

        System.out.println("************** char array *******************");
        char[] array3 = {'b','a','b','a','s','c','a'};
        System.out.println(Arrays.toString(array3));

        array3 = removeDup(array3);
        System.out.println(Arrays.toString(array3));



    }

    // remove dublicated 'int' element from 'int' array
    public static int[] removeDup(int[] array){
        int[] newArr = {};
        for (int each : array) {
            if (!ArraysUtility.contains(newArr,each)){
                newArr = ArraysUtility.addElement(newArr,each);
            }
        }
        return newArr;
    }

    // remove dublicated 'double' element from 'double' array
    public static double[] removeDup(double[] array){
        double[] newArr = {};
        for (double each : array) {
            if (!ArraysUtility.contains(newArr,each)){
                newArr = ArraysUtility.addElement(newArr,each);
            }
        }
        return newArr;
    }

    // remove dublicated 'String' element from 'String' array
    public static String[] removeDup(String[] array){
        String[] newArr = {};
        for (String each : array) {
            if (!ArraysUtility.contains(newArr,each)){
                newArr = ArraysUtility.addElement(newArr,each);
            }
        }
        return newArr;
    }

    // remove dublicated 'char' element from 'char' array
    public static char[] removeDup(char[] array){
        char[] newArr = {};
        for (char each : array) {
            if (!ArraysUtility.contains(newArr,each)){
                newArr = ArraysUtility.addElement(newArr,each);
            }
        }
        return newArr;
    }



}
/*
 Task4: 
        1. create a method that can remove the duplicates from an array of integer
            Ex:
              int[] array = {1,1,1,2,2,2,3,4,5,5,5};
              removeDup(array);  ===> {1,2,3,4,5}

        2. create a method that can remove the duplicates from an array of double

        3. create a method that can remove the duplicates from an array of String

        4. create a method that can remove the duplicates from an array of char
            HINT: how did you remove the duplicates from a string?
 */
