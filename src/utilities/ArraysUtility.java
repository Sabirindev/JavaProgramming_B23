package utilities;

import java.util.Arrays;

public class ArraysUtility {

    // add integer to a int array[]
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

    // add double to a double array[]
    public static double[] addElement(double[] array, double number){
        double[] result = Arrays.copyOf(array,array.length+1);
        result[result.length-1] = number;
        return result;
    }

    //add String to a String array[]
    public static String[] addElement(String[] array, String str){
        String[] result = Arrays.copyOf(array, array.length + 1); // {A,B, null}
        result[result.length-1] = str;
        return result;
    }

    //add char to a char array[]
    public static char[] addElement(char[] array, char ch){
        char result[] = Arrays.copyOf(array, array.length+1);
        result[result.length-1] = ch;
        return result;
    }

    //returns the maximum number from a int array
    public static int max(int[] array){
        int max = array[0];
        for (int each : array) {
            max= Math.max(each,max);
        }
        return max;
    }

    //returns the maximum number from a double array
    public static double max(double[] array){
        double max = array[0];
        for (double each : array) {
            max= Math.max(each,max);
        }
        return max;
    }

    //returns the minumum number from a int array
    public static int min(int[] array){
        int min = array[0];
        for (int each : array) {
            min= Math.min(each,min);
        }
        return min;
    }

    //returns the minumum number from a double array
    public static double min(double[] array){
        double min = array[0];
        for (double each : array) {
            min= Math.min(each,min);
        }
        return min;
    }

    //merge two array of int
    public static int[] mergeSameSize(int[] arr1, int[] arr2){
        int arr3[] = new int[arr1.length + arr2.length];
        
        int j = 0;//index
        for (int each : arr1) { // each is ellements of arr1
            arr3[j++]= each;
        }
        for (int each : arr2) {// each is ellements of arr2
            arr3[j++] = each;
        }
        return arr3;
    }

    //merge two array of double
    public static double[] mergeSameSize(double[] arr1, double[] arr2){
        double arr3[] = new double[arr1.length + arr2.length];

        int j = 0;//index
        for (double each : arr1) { // each is ellements of arr1
            arr3[j++]= each;
        }
        for (double each : arr2) {// each is ellements of arr2
            arr3[j++] = each;
        }
        return arr3;
    }

    //merge two array of String
    public static String[] mergeSameSize(String[] arr1, String[] arr2){
        String arr3[] = new String[arr1.length + arr2.length];

        int j = 0;//index
        for (String each : arr1) { // each is ellements of arr1
            arr3[j++]= each;
        }
        for (String each : arr2) {// each is ellements of arr2
            arr3[j++] = each;
        }
        return arr3;
    }

    //merge two array of char
    public static char[] mergeSameSize(char[] arr1, char[] arr2){
        char arr3[] = new char[arr1.length + arr2.length];

        int j = 0;//index
        for (char each : arr1) { // each is ellements of arr1
            arr3[j++]= each;
        }
        for (char each : arr2) {// each is ellements of arr2
            arr3[j++] = each;
        }
        return arr3;
    }


    //remove the element at given index of the int array
    public static int[] removeElement(int[] array, int index){

        if(index < 0 || index >= array.length){
            System.out.println("Invalid index");
            System.exit(0);
        }
        int[] arr = new int[array.length-1];

        for (int i = 0, j =0; i < array.length; i++) {
            if (i== index){
                continue;
            }else {
                arr[j++] = array[i];
            }
        }
        return arr;
    }


    // remove the element at given index of the double array
    public static double[] removeElement(double[] array, int index){

        if(index < 0 || index > array.length -1 ){ // if the given index number is invalid
            System.err.println("Invalid Index");
            System.exit(0); // exits the system
        }

        double[] result = new double[array.length-1];

        for(int i = 0, j = 0; i < array.length; i++ ){
            if(i == index){ // stores all the elements of array except the element at given index
                continue;
            }else{
                result[j++]  = array[i];
            }
        }

        return result;
    }

    // remove the element at given index of the String array
    public static String[] removeElement(String[] array, int index){

        if(index < 0 || index > array.length -1 ){ // if the given index number is invalid
            System.err.println("Invalid Index");
            System.exit(0); // exits the system
        }

        String[] result = new String[array.length-1];

        for(int i = 0, j = 0; i < array.length; i++ ){
            if(i == index){ // stores all the elements of array except the element at given index
                continue;
            }else{
                result[j++]  = array[i];
            }
        }

        return result;
    }

    // remove the element at given index of the char array
    public static char[] remove(char[] array, int index){

        if(index < 0 || index > array.length -1 ){ // if the given index number is invalid
            System.err.println("Invalid Index");
            System.exit(0); // exits the system
        }

        char[] result = new char[array.length-1];

        for(int i = 0, j = 0; i < array.length; i++ ){
            if(i == index){ // stores all the elements of array except the element at given index
                continue;
            }else{
                result[j++]  = array[i];
            }
        }

        return result;
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


    //return falseOrTrue if Given element is Contained in 'int' array
    public static boolean contains(int[] array, int element) {
        boolean result = false;

        for (int each : array) {
            if (each == element) {
                return true;
            }
        }

        return false;
    }

    //return falseOrTrue if Given element is Contained in 'double' array
    public static boolean contains(double[] array, double element) {
        boolean result = false;

        for (double each : array) {
            if (each == element) {
                return true;
            }
        }

        return false;
    }

    //return falseOrTrue if Given element is Contained in 'String' array
    public static boolean contains(String[] array, String element) {
        boolean result = false;

        for (String each : array) {
            if (each.equals(element)) {
                return true;
            }
        }

        return false;
    }

    //return falseOrTrue if Given element is Contained in 'char' array
    public static boolean contains(char[] array, char element) {
        boolean result = false;

        for (char each : array) {
            if (each == element) {
                return true;
            }
        }

        return false;
    }


    //return the frequency of given int number in 'int' array
    public static int frequency(int[] array, int number){
        int count = 0;
        for (int each : array) {
            if (each == number){
                count++;
            }
        }
        return count;
    }

    //return the frequency of given double number in 'double' array
    public static int frequency(double[] array, double number){
        int count = 0;
        for (double each : array) {
            if (each == number){
                count++;
            }
        }
        return count;
    }

    //return the frequency of given string in 'String' array
    public static int frequency(String[] array, String str){
        int count = 0;
        for (String each : array) {
            if (each.equals(str)){
                count++;
            }
        }
        return count;
    }

    //return the frequency of given char in 'char' array
    public static int frequency(char[] array, char ch){
        int count = 0;
        for (char each : array) {
            if (each == ch){
                count++;
            }
        }
        return count;
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
