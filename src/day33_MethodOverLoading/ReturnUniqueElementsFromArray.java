package day33_MethodOverLoading;

import utilities.ArraysUtility;

import java.util.Arrays;

public class ReturnUniqueElementsFromArray {
    public static void main(String[] args) {
        System.out.println("************** unique int ************");
        int[] array = {1, 1, 1, 2, 3, 3, 4, 5, 5, 6};
        System.out.println(Arrays.toString(array));
        array = unique(array);
        System.out.println(Arrays.toString(array));

        System.out.println("************** unique double ************");
        double[] array1 = {1.5,2.0,1.5,3.1,5.2,6.9,5.2,6.9};
        System.out.println(Arrays.toString(array1));
        array1 = unique(array1);
        System.out.println(Arrays.toString(array1));

        System.out.println("************** unique String ************");
        String[] array3 = {"bbb","aaa","bbb","aaa","Sabir","ccc","aaa"};
        System.out.println(Arrays.toString(array3));
        array3 =  unique(array3);
        System.out.println(Arrays.toString(array3));

        System.out.println("************** unique char ************");

        char[] array4 = {'b','a','b','a','s','c','a'};
        System.out.println(Arrays.toString(array4));
        array4 =  unique(array4);
        System.out.println(Arrays.toString(array4));



    }

    // return unique 'int' number from 'int' array
    public static int[] unique(int[] array){
        int count=0;
        int [] result = {};
        for (int each : array) {
            if (ArraysUtility.frequency(array,each)==1){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    // return unique 'double' number from 'double' array
    public static double[] unique(double[] array){
        double [] result = {};
        for (double each : array) {
            if (ArraysUtility.frequency(array,each)==1){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    // return unique 'String' element from 'String' array
    public static String[] unique(String[] array){
        String [] result = {};
        for (String each : array) {
            if (ArraysUtility.frequency(array,each)==1){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    // return unique 'char' element from 'char' array
    public static char[] unique(char[] array){
        char [] result = {};
        for (char each : array) {
            if (ArraysUtility.frequency(array,each)==1){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }
}


/*
Task5:
        1. create a method that can return the unique elements from the array of integers
            Ex:
                int[] array = {1,1,2,3,3,4};

                unique(array) ==> {2, 4};

    2. create a method that can return the unique elements from the array of double

    3. create a method that can return the unique elements from the array of String

    4. create a method that can return the unique elements from the array of char

 */
