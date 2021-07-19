package day33_MethodOverLoading;

import java.util.Arrays;

public class WarmUpTask1 {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5};
        System.out.println(Arrays.toString(array));

        array = reverse(array);
        System.out.println(Arrays.toString(array));

        System.out.println("***********************************");

        double array1[] = {1.5,2.5,3.5,4.5,5.5,6.5};
        System.out.println(Arrays.toString(array1));

        array1 = reverse(array1);
        System.out.println(Arrays.toString(array));


        System.out.println("***********************************");

        String student[] = {"Muhammed","Aleksandra","Elmira"};
        System.out.println(Arrays.toString(student));

        student = reverse(student);
        System.out.println(Arrays.toString(student));

        System.out.println("***********************************");

        char ch[] = {'a','b','c','d','e'};
        System.out.println(Arrays.toString(ch));

        ch = reverse(ch);
        System.out.println(Arrays.toString(ch));


    }

    //return the reversed array from original int array
    public static int[] reverse(int[] array){ // {1,2,3,4,5} i: last index ~ 0
        int result[] = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            result[i] = array[(array.length-1)- i];
        }

        return result;
     }

    //return the reversed array from original double array
    public static double[] reverse(double[] array){ // {1,2,3,4,5} i: last index ~ 0
        double result[] = new double[array.length];

        for (int i = 0; i < array.length; i++) {
            result[i] = array[(array.length-1)- i];
        }

        return result;
    }

    //return the reversed array from original String array
    public static String[] reverse(String[] array){ // {1,2,3,4,5} i: last index ~ 0
        String result[] = new String[array.length];

        for (int i = 0; i < array.length; i++) {
            result[i] = array[(array.length-1)- i];
        }

        return result;
    }

    //return the reversed array from original char array
    public static char[] reverse(char[] array){ // {1,2,3,4,5} i: last index ~ 0
        char result[] = new char[array.length];

        for (int i = 0; i < array.length; i++) {
            result[i] = array[(array.length-1)- i];
        }

        return result;
    }
}

