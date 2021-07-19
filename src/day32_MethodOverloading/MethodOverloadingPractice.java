package day32_MethodOverloading;

import java.util.Arrays;

public class MethodOverloadingPractice {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        int element = 10;
        System.out.println("***************** int[] array and int variable **************************");
        System.out.println(Arrays.toString(array));
        array = addInteger(array, element); //{1,2,3,4,5,6,7,8,9,10}
        System.out.println(Arrays.toString(array));

        array = addInteger(array, 11); //{1,2,3,4,5,6,7,8,9,10, 11}

        System.out.println(Arrays.toString(array));

        System.out.println("***************** double[] array and double variable ******************************");
        double[] array2 = {1.5,2.5};
        System.out.println(Arrays.toString(array2));

        array2 = addDouble(array2,5.5);
        System.out.println(Arrays.toString(array2));

        System.out.println("***************** String[] array and String variable ******************************");

        String[] group1 = {"Sabir", "Gabil", "Dilem"};
        String student = "Christian";

        addString(group1,student); // {"Sabir", "Gabil", "Dilem"}; still is same value
        System.out.println(Arrays.toString(group1));//{"Sabir", "Gabil", "Dilem"}

        group1 = addString(group1,student);
        System.out.println(Arrays.toString(group1));//{"Sabir", "Gabil", "Dilem", "Christian"}

        System.out.println("***************** char[] array and char variable ******************************");
        char array3[] = {'A','B'};
        char ch3 = 'C';

        addChar(array3,ch3);
        System.out.println(Arrays.toString(array3));

        array3 = addChar(array3,ch3);
        System.out.println(Arrays.toString(array3));

        System.out.println("*************** Method Overloading *****************");

        int[] arr1 = {1,2,3,4,5,6,7};
        arr1 = addElement(arr1, 8);

        System.out.println( Arrays.toString(arr1));

        double[] arr2 = {10.5, 3.5, 4.5};
        arr2 = addElement(arr2, 20.5);

        System.out.println( Arrays.toString(arr2));

        String[] items = {"Milk", "Eggs", "Rice"};
        items = addElement(items, "Apple");
        System.out.println( Arrays.toString(items));


        char[] ch = {'A', 'B', 'C'};
        ch = addElement(ch, 'D');
        System.out.println( Arrays.toString(ch));

        //  addElement(  new int[]{1,2,3,4,5} ,  10  );


    }

    //*********************************************************************
    //*********************************************************************
    //*********************************************************************


    // 1. create a return method called addInteger that can add an Integer number after the  last index of an integer array
    public static int[] addInteger(int[] array, int number) {
        /*
        int result[] = new int[array.length + 1];
        int i = 0;
        for (int each : array) {
            result[i++] = each;
        }
        result[i] = number;

         */
        int[] result = Arrays.copyOf( array,   array.length+1 );
        result[ result.length -1] = number;

        return result;
    }

    // 2. create a return method called addDouble that can add a double number after the last index of a double array
    public static double[] addDouble(double[] array, double number){
        double[] result = Arrays.copyOf(array,array.length+1);
        result[result.length-1] = number;
        return result;
    }

    // 3. create a return method called addString that can add a String after the last index of a String array
   public static String[] addString(String[] array, String str){
       String[] result = Arrays.copyOf(array, array.length + 1); // {A,B, null}
       result[result.length-1] = str;
      return result;
   }

   // 4. create a return method called addChar that can add a char after last index of a char array
    public static char[] addChar(char[] array, char ch){
        char result[] = Arrays.copyOf(array, array.length+1);
        result[result.length-1] = ch;
        return result;
    }

    //*********************** Method OverLoading is instead of prevois 4 method*******************************

    public static int[] addElement(int[] array, int number) {
        /*
        int result[] = new int[array.length + 1];
        int i = 0;
        for (int each : array) {
            result[i++] = each;
        }
        result[i] = number;

         */
        int[] result = Arrays.copyOf( array,   array.length+1 );
        result[ result.length -1] = number;

        return result;
    }

    public static double[] addElement(double[] array, double number){
        double[] result = Arrays.copyOf(array,array.length+1);
        result[result.length-1] = number;
        return result;
    }

    public static String[] addElement(String[] array, String str){
        String[] result = Arrays.copyOf(array, array.length + 1); // {A,B, null}
        result[result.length-1] = str;
        return result;
    }

    public static char[] addElement(char[] array, char ch){
        char result[] = Arrays.copyOf(array, array.length+1);
        result[result.length-1] = ch;
        return result;
    }
}
